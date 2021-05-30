package Lab;

import java.net.*;
import java.io.*;

class TCPIPServer {

    static int countclients = 0;

    public static void main(String args[]) throws IOException {
        ServerSocket sSocket  = null;
        InputStream sInput  = null;
        OutputStream sOutput  = null;

        try {
            sSocket = new ServerSocket(1024);
            while (true) {
                Socket client = sSocket.accept();
                countclients++;

                System.out.println("=======================================");
                System.out.println("Client " + countclients + " connected");

                sInput = client.getInputStream();
                sOutput = client.getOutputStream();

                boolean flag = true;
                while (flag) {
                    byte[] bytes = new byte[1024];
                    sInput.read(bytes);
                    String str = new String(bytes, "UTF-8");

                    int j = 0;
                    for(int i = 0; i <= str.length(); i++) {
                        j = i + 1;
                        if(j % 4 == 0)
                            str = str.substring(0,i) + '%' + str.substring(i,str.length());
                    }

                    bytes=str.getBytes();
                    sOutput.write(bytes);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.toString());
        } finally {
            sInput.close();
            sOutput.close();
            sSocket.close();
            System.out.println("Client " + countclients + " disconnected");
        }
    }
}
