package Chieu0107.Redo;

import java.util.ArrayList;
import java.util.List;

public class CourseApp {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        Course c = new Course("Course Offline", "Nguyen Anh Tuan", 15);
        Student s1 = new Student("StudentA");
        Student s2 = new Student("StudentB");
        c.students.add(s1);
        c.students.add(s2);
        courses.add(c);
        CourseOnline co1 = new CourseOnline("Course Online", "Tran Anh Duong",
                10, "Zoom", 20);
        Student s3 = new Student("StudentC");
        Student s4 = new Student("StudentD");
        co1.students.add(s3);
        co1.students.add(s4);
        courses.add(co1);
        for (Course course : courses) {
            course.displayDetailCourse();
            course.displayStudent();
        }
    }
}
