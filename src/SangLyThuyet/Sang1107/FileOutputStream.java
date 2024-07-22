package SangLyThuyet.Sang1107;

import java.io.IOException;

public class FileOutputStream {
    public static void main(String[] args) {
        //Create path
        String destinationFile = "1107Morning.txt";
        String content = "Hello World 123";

        java.io.FileOutputStream fos = null;
        try {
            fos = new java.io.FileOutputStream(destinationFile);
            fos.write(content.getBytes());
            System.out.println("Create and write file successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fos.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
