package SangLyThuyet.Sang1107;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndWriteFileExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Open StudentList file
        String studentListFilePath = "StudentsList.txt";
        //Create object BufferedReader
        BufferedReader reader = null;
        //Create object BufferedWriter
        BufferedWriter writer = null;
        try {
            //read studentListFile
            reader = new BufferedReader(new FileReader(studentListFilePath));
            //variable to store read file
            ArrayList<String> temp = new ArrayList<>();
            String str = "";
            int characters;
            //Print every line from file to console
            while ((characters = reader.read()) != -1) {
                str += (char) characters;
            }

            //Input name file B
            System.out.print("Input name file B: ");
            String fileBName;
            fileBName = sc.next();

            //Create new object
            writer = new BufferedWriter(new FileWriter(fileBName));
            //write file A to file B
            writer.write(str);

            //delete fileA and check isSuccess
            File deleteFileA = new File("StudentsList2.txt");
            if(deleteFileA.delete()){
                System.out.println("Delete file A successfully");
            }else {
                System.out.println("Delete file unsuccessfully");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                reader.close();
                writer.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
