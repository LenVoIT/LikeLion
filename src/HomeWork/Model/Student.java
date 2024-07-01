package HomeWork.Model;

import java.time.LocalDate;

public class Student {
    private static int idCounter;
    private int id;
    private String name;
    private LocalDate dob;
    private String idCard;

    public Student(int id, String name, LocalDate dob, String idCard) {
        this.id = ++idCounter;
        this.name = name;
        this.dob = dob;
        this.idCard = idCard;
    }

    public Student() {
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
