package ChieuThucHanh.Chieu0107.Redo;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private static int courseIdCounter = 1;
    private int courseId;
    private String courseName;
    private String mentorName;
    private int credit;
    List<Student> students;

    public Course() {
    }

    public Course(String courseName, String mentorName, int credit) {
        //khởi tạo list students trong constructor
        students = new ArrayList<>();
        this.courseId = courseIdCounter++;
        this.courseName = courseName;
        this.mentorName = mentorName;
        this.credit = credit;
    }
    public void displayStudent(){
        System.out.println("List student:");
        System.out.println("ID\t\t" + "Student's name");
        for(Student student:students){
            System.out.println(student.toString());
        }
    }

    @Override
    public String toString() {
        return this.courseId + "\t\t" + this.courseName + "\t\t" + this.mentorName + "\t\t" + this.credit;
    }
    public void displayDetailCourse(){
        System.out.println("Detail Course:");
        System.out.println("ID\t\t" + "Course's name\t\t" + "Mentor's name\t\t" + "Credit");
        System.out.println(this.toString());
    }
}
