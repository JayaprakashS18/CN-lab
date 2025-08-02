import java.io.*;
import java.net.*;
class Server1 {
  public static void main(String[] a) 
  throws Exception {
    String[] ip = {"165.165.80.80", "165.165.79.1"}, mac = {"6A:08:AA:C2", "8A:BC:E3:FA"};
    ServerSocket ss = new ServerSocket(3636);
    Socket s = ss.accept();
    BufferedReader din = new BufferedReader(new InputStreamReader(s.getInputStream()));
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    String str = din.readLine(); 
    int i;
    for (i = 0; i < ip.length; i++)
    if (str.equals(ip[i])) break;
    dout.writeBytes((i < ip.length ? mac[i] : "MAC not found") + "\n");
    s.close(); 
    ss.close();
  }
}
