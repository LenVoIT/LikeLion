package HomeWork.Service;

import HomeWork.Model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    Scanner s = new Scanner(System.in);
    //định dạng ngày theo format dd/MM/yyyy
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//    static ArrayList<Student> students = new ArrayList<>();
//
//
//    public void add() {
//        Student student = new Student();
//        System.out.print("Input student's name:");
//        String sName = s.next();
//        student.setName(sName);
//        System.out.print("\nInput student's dob(dd/MM/yyyy): ");
//        String dob = s.next();
//        LocalDate date = LocalDate.parse(dob, formatter);
//        student.setDob(date);
//        System.out.print("\nId Card: ");
//        String cccd = s.next();
//        student.setIdCard(cccd);
//        students.add(student);
//    }
}
