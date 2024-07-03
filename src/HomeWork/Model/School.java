package HomeWork.Model;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Classroom> classrooms;
    private List<Student> students;

//    public School(List<Classroom> classrooms, List<Student> students, List<Teacher> teachers) {
//        this.classrooms = new ArrayList<>();
//        this.students = new ArrayList<>();
//        this.teachers = new ArrayList<>();
//    }

    public School(){

    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


}
