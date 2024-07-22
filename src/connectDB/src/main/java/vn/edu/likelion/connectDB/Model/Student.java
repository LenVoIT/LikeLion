package vn.edu.likelion.connectDB.Model;

public class Student {
    private int studentId;
    private String fullName;
    private int status;
    public Student() {
    }

    public Student(int studentId, String fullName, int status) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
