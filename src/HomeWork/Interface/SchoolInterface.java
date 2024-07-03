package HomeWork.Interface;

import HomeWork.Model.Classroom;
import HomeWork.Model.Student;

import java.time.LocalDate;

public interface SchoolInterface {
    //Student
    void addStudents(Student student);
    void updateStudentInfo(int id, String name, LocalDate dob, String idCard);
    void showStudents();
    Student getStudentById(int id);
    //classrooms
    void addClassroom(Classroom classroom);
    void showClassrooms();
}
