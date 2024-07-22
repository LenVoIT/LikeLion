package SangLyThuyet.Sang1107;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath="1107MorningFileWriter.txt";

        FileReader fr = null;
        try{
            //Read file
            fr = new FileReader(filePath);
            //variable to store read characters
            int characters;
            //Read characters from file to console
            while((characters = fr.read()) != -1){
                System.out.print((char) characters);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
