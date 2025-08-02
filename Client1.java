import java.io.*; 
import java.net.*;
class Client1 {
  public static void main(String[] a)
  throws Exception {
    Socket s = new Socket("127.0.0.1", 3636);
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    BufferedReader din = new BufferedReader(new InputStreamReader(s.getInputStream()));
    System.out.print("Enter IP: "); 
    dout.writeBytes(in.readLine() + "\n");
    System.out.println("MAC: " + din.readLine());
    s.close();
  }
}
