package HomeWork.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private static int idClassCounter = 1;
    private int id;
    private LocalDate startClassDate;
    private boolean isStarted;
    List<Student> students;
    List<Teacher> teachers;

    public Classroom(LocalDate startClassDate, boolean isStarted, List<Student> students, List<Teacher> teachers) {
        this.id = idClassCounter++;
        this.startClassDate = startClassDate;
        this.isStarted = isStarted;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public Classroom() {
        this.id = idClassCounter++;
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

    @Override
    public String toString() {
        return "id: " + id + "\tStart date: " + startClassDate;
    }
}
