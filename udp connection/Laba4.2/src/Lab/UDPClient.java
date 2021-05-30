package Lab;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class UDPClient {
    public void runClient() throws IOException {
        DatagramSocket s = null;
        try {
            byte[] buf = new byte[512];
            s = new DatagramSocket();
            System.out.println("UDPClient: Started");

            System.out.println("Input x, y, z: ");
            Scanner in = new Scanner(System.in);
            String values;
            values = in.nextLine();

            byte[] cmd;
            cmd = values.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(cmd, cmd.length, InetAddress.getByName("127.0.0.1"), 8001);
            s.send(sendPacket);
            DatagramPacket recvPacket = new DatagramPacket(buf, buf.length);
            s.receive(recvPacket);
            String result = new String(recvPacket.getData()).trim();
            System.out.println("UDPClient: Function Result: " + result);

            System.out.println("UDPClient: Ended");
        }
        finally {
            if (s != null) {
                s.close();
            }  }  }
    public static void main(String[] args) {
        try {
            UDPClient client = new UDPClient();
            client.runClient();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }

}
