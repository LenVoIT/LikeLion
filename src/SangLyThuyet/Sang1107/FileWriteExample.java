package SangLyThuyet.Sang1107;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath = "1107MorningFileWriter.txt";
        String content = "Adios";

        //create object FileWriter
        FileWriter fw = null;
        try{
            //create instance
            fw = new FileWriter(filePath);
            //write content into file
            fw.write(content);
            System.out.println("Write file success");
        }catch (IOException ioe){
            ioe.printStackTrace();
        }finally {
            try{
                fw.close();
            }catch (IOException io){
                io.printStackTrace();
            }
        }
    }
}
