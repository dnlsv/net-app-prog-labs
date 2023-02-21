package server.thread;

import server.database.DatabaseConnection;
import server.database.ProductTable;
import server.model.Product;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{

    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;
    private InetAddress inetAddress;
    private int counter;
    private String clientMessage;


    public ServerThread(Socket socket, int _counter) throws IOException {
        this.outputStream = new ObjectOutputStream(socket.getOutputStream());
        this.inputStream = new ObjectInputStream(socket.getInputStream());
        this.inetAddress = socket.getInetAddress();
        this.counter = _counter;

    }

    public void writeObj(String str) {
        this.clientMessage = str;
        try {
            this.outputStream.writeObject(this.clientMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        String messageToClient = "";
        String str;
        String ThreadStop = "";

        System.out.println("Сервер ожидает действий от клиента");

        while (!ThreadStop.equals("Exit")) {
            try {
                str = (String) this.inputStream.readObject();
                System.out.println(str);
                if(str.equals("123")){
                    DatabaseConnection connection = new DatabaseConnection();
                    ProductTable productTable = new ProductTable(connection.getDatabaseConnection());
                    ArrayList<Product> arrayList = productTable.getProductTable();
                    //outputStream.writeObject(arrayList);
                }
                /*String[] messageParts = str.split(",");
                switch (messageParts[0]) {
                    case "checkLoginClient":
                        String UserLogin = messageParts[1];
                        String UserPassword = messageParts[2];
                        messageToClient = this.usersTable.CheckLoginClient(UserLogin, UserPassword);
                        this.writeObject(messageToClient);
                        break;
                }*/
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                this.disconnect();
            }

        }

    }

    private void disconnect() {
        try {
            if (this.outputStream != null) {
                this.outputStream.close();
            }
            if (this.inputStream != null) {
                this.inputStream.close();
            }
            System.out.println(this.inetAddress.getHostName() + " Закрытие соединения " + this.counter + "го клиента");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            this.interrupt();
        }
    }
}
