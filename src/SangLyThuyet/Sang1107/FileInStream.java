package SangLyThuyet.Sang1107;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInStream {
    public static void main(String[] args) {
        //path and file need to be read
        //if no path then auto find folder outside project
        //if file doesn't exist return fileNotFoundException
        String filePath = "1107Morning.txt";

        //Create 1 object FileInputStream with variable fis
        FileInputStream fis = null;
        try {
            //create instace of FileInputStream class
            fis = new FileInputStream(filePath);

            byte[] content = new byte[1024];
            int byteRead;
            //print content in file into console
            while ((byteRead = fis.read(content)) != -1) {
                System.out.print(new String(content, 0, byteRead));
            }
        } catch (IOException fnfe) {
            fnfe.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
