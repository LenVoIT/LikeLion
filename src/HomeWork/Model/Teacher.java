package HomeWork.Model;

import java.util.List;

public class Teacher {
    private static int idCounter;
    private int id;
    private String name;
    List<Classroom> classrooms;

    public Teacher(String name, List<Classroom> classrooms) {
        this.id = ++idCounter;
        this.name = name;
        this.classrooms = classrooms;
    }

    public Teacher() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Teacher's name: " + name + " Classrooms: " + classrooms;
    }
}
