package HomeWork.Model;

import java.time.LocalDate;
import java.util.List;

public class Classroom {
    private static int idCounter;
    private int id;
    private LocalDate startClassDate;
    private boolean isStarted;
    List<Student> students;
    List<Teacher> teachers;

    public Classroom(int id, LocalDate startClassDate, boolean isStarted, List<Student> students, List<Teacher> teachers) {
        this.id = id;
        this.startClassDate = startClassDate;
        this.isStarted = isStarted;
        this.students = students;
        this.teachers = teachers;
    }

    public Classroom() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartClassDate() {
        return startClassDate;
    }

    public void setStartClassDate(LocalDate startClassDate) {
        this.startClassDate = startClassDate;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
