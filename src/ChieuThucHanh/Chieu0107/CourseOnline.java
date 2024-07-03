package ChieuThucHanh.Chieu0107;

import java.time.LocalTime;

public class CourseOnline extends Course {
    private String nenTang;
    private int thoiLuong;

    public CourseOnline(String nenTang, int thoiLuong) {
        this.nenTang = nenTang;
        this.thoiLuong = thoiLuong;
    }

    public CourseOnline(int id, String courseName, String mentorName, int credit, String nenTang, int thoiLuong) {
        super(id, courseName, mentorName, credit);
        this.nenTang = nenTang;
        this.thoiLuong = thoiLuong;
    }

    @Override
    public void displayDetailCourse() {
        super.displayDetailCourse();
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t" + nenTang + "\t\t" + thoiLuong;
    }
}
