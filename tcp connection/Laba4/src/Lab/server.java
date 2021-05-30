package Lab;
import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] arg){
        ServerSocket sSocket = null;
        Socket cAccepted = null;
        ObjectInputStream sInput = null;
        ObjectOutputStream sOutput = null;

        try {
            System.out.println("Запуск сервера...");
            sSocket = new ServerSocket(2524);
            cAccepted = sSocket.accept();
            System.out.println("Соединение установлено...");
            sInput = new ObjectInputStream(cAccepted.getInputStream());
            sOutput = new ObjectOutputStream(cAccepted.getOutputStream());
            String str = (String) sInput.readObject();
            String letters, gl, so;
            int glas = 0, sog = 0;
            System.out.println("Строка: " + str);
           for(int i = 0; i < str.length(); i++){
               if (str.charAt(i) == 'а' || str.charAt(i) == 'о' || str.charAt(i) == 'и' || str.charAt(i) == 'э' || str.charAt(i) == 'е'
                       || str.charAt(i) == 'ё' || str.charAt(i) == 'ы' || str.charAt(i) == 'у' || str.charAt(i) == 'ю' || str.charAt(i) == 'я'
               || str.charAt(i) == 'А' || str.charAt(i) == '0' || str.charAt(i) == 'И' || str.charAt(i) == 'Э' || str.charAt(i) == 'Е'
                       || str.charAt(i) == 'Ё' || str.charAt(i) == 'Ы' || str.charAt(i) == 'У' || str.charAt(i) == 'Ю' || str.charAt(i) == 'Я')
                   glas++;
               if(str.charAt(i) == 'й' || str.charAt(i) == 'ц' || str.charAt(i) == 'к' || str.charAt(i) == 'н' || str.charAt(i) == 'г'
                       || str.charAt(i) == 'ш' || str.charAt(i) == 'щ' || str.charAt(i) == 'з' || str.charAt(i) == 'х' || str.charAt(i) == 'ъ'
                       || str.charAt(i) == 'ф' || str.charAt(i) == 'в' || str.charAt(i) == 'п' || str.charAt(i) == 'р' || str.charAt(i) == 'л'
                       || str.charAt(i) == 'д' || str.charAt(i) == 'ж' || str.charAt(i) == 'ч' || str.charAt(i) == 'с' || str.charAt(i) == 'м'
                       || str.charAt(i) == 'т' || str.charAt(i) == 'ь' || str.charAt(i) == 'б'
               || str.charAt(i) == 'Й' || str.charAt(i) == 'Ц' || str.charAt(i) == 'К' || str.charAt(i) == 'Н' || str.charAt(i) == 'Г'
                       || str.charAt(i) == 'Ш' || str.charAt(i) == 'Щ' || str.charAt(i) == 'З' || str.charAt(i) == 'Х' || str.charAt(i) == 'Ъ'
                       || str.charAt(i) == 'Ф' || str.charAt(i) == 'В' || str.charAt(i) == 'П' || str.charAt(i) == 'Р' || str.charAt(i) == 'Л'
                       || str.charAt(i) == 'Д' || str.charAt(i) == 'Ж' || str.charAt(i) == 'Ч' || str.charAt(i) == 'С' || str.charAt(i) == 'М'
                       || str.charAt(i) == 'Т' || str.charAt(i) == 'Ь' || str.charAt(i) == 'Б')
                   sog++;
           }
           gl = Integer.toString(glas);
           so = Integer.toString(sog);
           letters = "Гласных " + gl + ", Согласных " + so;

            sOutput.writeObject(letters);
            letters = (String) sInput.readObject();
        } catch(Exception e) {
        } finally{
          try{
              sInput.close();
              sOutput.close();
              cAccepted.close();
              sSocket.close();
          } catch(Exception e) {
              e.printStackTrace();
          }
        }
    }
}

