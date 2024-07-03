package HomeWork;

import HomeWork.Model.Classroom;
import HomeWork.Model.Student;
import HomeWork.Service.ClassroomService;
import HomeWork.Service.SchoolService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();
        ArrayList<Classroom> classrooms = SchoolService.classrooms;
        ArrayList<Student> students = SchoolService.students;
        //Thêm 3 classroom
        Classroom classroom1 = new Classroom();
        Classroom classroom2 = new Classroom();
        Classroom classroom3 = new Classroom();
        classrooms.add(classroom1);
        classrooms.add(classroom2);
        classrooms.add(classroom3);
        //Hiện thị các classrooms
        schoolService.showClassrooms();
        //Thêm 10 student
        //Khởi tạo 10 Objects Student
        Student s1 = new Student("A", LocalDate.parse("2002-01-01"), "1001", false);
        Student s2 = new Student("B", LocalDate.parse("2003-01-01"), "1002", false);
        Student s3 = new Student("C", LocalDate.parse("2004-01-01"), "1003", false);
        Student s4 = new Student("D", LocalDate.parse("2002-12-12"), "1004", false);
        Student s5 = new Student("E", LocalDate.parse("2002-03-12"), "1005", false);
        Student s6 = new Student("F", LocalDate.parse("2003-04-15"), "1006", false);
        Student s7 = new Student("G", LocalDate.parse("2004-06-10"), "1007", false);
        Student s8 = new Student("H", LocalDate.parse("2003-07-01"), "1008", false);
        Student s9 = new Student("I", LocalDate.parse("2004-07-01"), "1009", false);
        Student s10 = new Student("J", LocalDate.parse("2023-09-01"), "1010", false);
        //thêm Student vào list students
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        //Show student
        schoolService.showStudents();
        //Gán student vào classroom

        //Gán teacher vào classroom

        ClassroomService classroomService = new ClassroomService();
        classroomService.addStudentIntoClass(schoolService.getStudentById(1));
    }
}
