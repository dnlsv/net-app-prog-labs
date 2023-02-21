import java.io.*;
import java.net.URL;

public class WordSearch {

    private String getText(){

        URL resource = getClass().getClassLoader().getResource("searchHere.txt");
        String file = resource.getFile();
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

    public int wordSearch(String substring){
        String str = getText();
        int count = 0;
        while(str.contains(substring) != false) {
            if (str.indexOf(substring) != -1) {
                count++;
                str = str.substring(str.indexOf(substring) + substring.length(), str.length());
            }
        }
        return count;
    }

}
