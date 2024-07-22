package vn.edu.likelion.connectDB.Model;

import java.util.Date;

public class Attendance {
    private int id;
    private int studentId;
    private char isAttend;
    private Date attendDate;
    public Attendance(){}
    public Attendance(int id, int studentId, char isAttend, Date attendDate) {
        this.id = id;
        this.studentId = studentId;
        this.isAttend = isAttend;
        this.attendDate = attendDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getIsAttend() {
        return isAttend;
    }

    public void setIsAttend(char isAttend) {
        this.isAttend = isAttend;
    }

    public Date getAttendDate() {
        return attendDate;
    }

    public void setAttendDate(Date attendDate) {
        this.attendDate = attendDate;
    }
}
