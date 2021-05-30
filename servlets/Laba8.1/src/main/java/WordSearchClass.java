import java.io.*;

public class WordSearchClass {

    public String getText(){

        String file = "D:\\file.txt";
        BufferedReader reader = null;
        String currentLine = "";
        String str = "";
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while ((currentLine = reader.readLine()) != null)
                str = str + " " + currentLine;
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }

    public int WordSearch(String substirng){
        String str = getText();
        int count = 0;
        while(str.contains(substirng) != false) {
            if (str.indexOf(substirng) != -1) {
                count++;
                str = str.substring(str.indexOf(substirng) + substirng.length(), str.length());
            }
        }
        return count;
    }

}
