package HomeWork.Model;

import java.time.LocalDate;

public class Student {
    private static int idCounter = 1;
    private int id;
    private String name;
    private LocalDate dob;
    private String idCard;
    private boolean isDropped = false;


    public Student(String name, LocalDate dob, String idCard, boolean isDropped) {
        this.id = idCounter++;
        this.name = name;
        this.dob = dob;
        this.idCard = idCard;
        this.isDropped = isDropped;
    }

    public boolean isDropped() {
        return isDropped;
    }

    public void setDropped(boolean dropped) {
        isDropped = dropped;
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

    @Override
    public String toString() {
        return "id: " + id + "\tStudent's name: " + name + "\tDOB: " + dob +
                "\tIdCard: " + idCard + "\tisDropped=" + isDropped;

    }
}
