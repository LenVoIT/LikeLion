package HomeWork.Model;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Classroom> classrooms;
    List<Student> students;
    List<Teacher> teachers;
    List<String> dropReasons;

    public School(){
        classrooms = new ArrayList<>();
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        dropReasons = new ArrayList<>();
    }
}
