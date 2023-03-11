package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

class Server {

    static int clientCount = 0;

    public static void main(String[] args) throws IOException {
        ServerSocket sSocket = null;
        InputStream sInput = null;
        OutputStream sOutput = null;

        try {
            sSocket = new ServerSocket(1024);
            while (true) {
                Socket client = sSocket.accept();
                clientCount++;

                System.out.println("=======================================");
                System.out.println("Client " + clientCount + " connected");

                sInput = client.getInputStream();
                sOutput = client.getOutputStream();

                boolean flag = true;
                while (flag) {
                    byte[] bytes = new byte[1024];
                    sInput.read(bytes);
                    String str = new String(bytes, StandardCharsets.UTF_8);

                    int j = 0;
                    for (int i = 0; i <= str.length(); i++) {
                        j = i + 1;
                        if (j % 4 == 0)
                            str = str.substring(0, i) + '%' + str.substring(i);
                    }

                    bytes = str.getBytes();
                    sOutput.write(bytes);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        } finally {
            sInput.close();
            sOutput.close();
            sSocket.close();
            System.out.println("Client " + clientCount + " disconnected");
        }
    }
}
