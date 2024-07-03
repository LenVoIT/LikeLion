package ChieuThucHanh.Chieu0107;

import java.util.ArrayList;
import java.util.List;

public class CourseApp {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        Course c1 = new Course(1,"Course1Offline", "Duong Tran", 10);
        c1.students.add(new Student(1,"Student1"));
        c1.students.add(new Student(2,"Student2"));
        courses.add(c1);

        CourseOnline co = new CourseOnline(2,"Course1Online","Nguyen Anh Tuan",15,
                "Google Meet",30);
        co.students.add(new Student(3,"Student 3"));
        co.students.add(new Student(4,"Student 4"));
        courses.add(co);

        for(Course course:courses){
            course.displayDetailCourse();
            course.displayStudents();
            System.out.println("THE END");
        }
    }
}
