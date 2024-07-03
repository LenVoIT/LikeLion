package HomeWork.Service;

import HomeWork.Model.Classroom;
import HomeWork.Model.School;
import HomeWork.Model.Student;
import HomeWork.Model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClassroomService {
    ArrayList<Student> students = SchoolService.students;
    public void addStudentIntoClass(Student student){
        if(students.size() < 10){
            students.add(student);
            System.out.println("Added successfully");
        }else {
            startClass();
        }
    }
    public void startClass(){
        Classroom classroom = new Classroom();
        if(students.size()==10){
            classroom.setStartClassDate(LocalDate.now());
            classroom.setStarted(true);
        }
    }
    public void addTeacherIntoClass(Teacher teacher){

    }
}
