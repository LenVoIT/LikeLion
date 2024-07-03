package HomeWork.Service;

import HomeWork.Model.Classroom;
import HomeWork.Model.School;
import HomeWork.Model.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClassroomService {
    ArrayList<Student> students = SchoolService.students;


   /*  public void addStudentIntoClass(ArrayList<Student> students, Classroom classroom) {
            if (students.size() < 10) {
                classroom.setStudents(students);
                System.out.println("Added successfully");
            } else {
                startClass();
            }
        }
    }

   public void startClass() {
        Classroom classroom = new Classroom();
        if (students.size() == 10) {
            classroom.setStarted(true);
            classroom.setStartClassDate(LocalDate.now());
        }
    }*/
}
