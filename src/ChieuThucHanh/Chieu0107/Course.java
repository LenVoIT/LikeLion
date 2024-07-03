package ChieuThucHanh.Chieu0107;

import javax.swing.plaf.LabelUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
    private int courseId;
    private String courseName;
    private String mentorName;
    private int credit;
    List<Student> students;
    Scanner s = new Scanner(System.in);

    public Course() {

    }

    public Course(int id, String courseName, String mentorName, int credit) {
        students = new ArrayList<>();
        this.courseId = id;
        this.courseName = courseName;
        this.mentorName = mentorName;
        this.credit = credit;

    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return this.courseId + "\t\t" + this.courseName + "\t\t" + this.mentorName + "\t\t" + this.credit;
    }

    public void displayDetailCourse() {
        System.out.println("ID" + "\t\tCourse name" + "\t\tMentor name" + "\t\tCredit");
        System.out.println(this.toString());
    }

    public void displayStudents() {
        System.out.println("ID" + "\t\tStudent's name");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
