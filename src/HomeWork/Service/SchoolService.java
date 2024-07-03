package HomeWork.Service;

import HomeWork.Model.Classroom;
import HomeWork.Model.Student;
import HomeWork.Model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;

public class SchoolService {
    //khởi tạo arrayList students
    public static ArrayList<Student> students = new ArrayList<>();
    //khởi tạo arrayList classrooms
    public static ArrayList<Classroom> classrooms = new ArrayList<>();
    //khởi tạo arrayList teachers
    static ArrayList<Teacher> teachers = new ArrayList<>();

    //Student
    public void addStudents(Student student) {
        students.add(student);
    }

    //tìm Sinh viên theo CCCD
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id)
                return student;
        }
        return null;
    }

    public void showStudents() {
        System.out.println("List students: ");
        //Duyệt từng phần tử trong list students
        for (Student student : students) {
            //xuất ra màn hình console
            System.out.println(student.toString());
        }
    }

    public void updateStudentInfo(int id, String name, LocalDate dob, String idCard) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setName(name);
            student.setDob(dob);
            student.setIdCard(idCard);
        }
    }
    //Teacher
        //public void addTeacher(Teacher teacher) {
        //    teachers.add(teacher);
        //}
        //
        //public void showTeachers() {
        //    System.out.println("List teachers: ");
        //    for (Teacher teacher : teachers) {
        //        System.out.println(teacher.toString());
        //    }
        //}

    //Classroom
    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    public void showClassrooms() {
        System.out.println("List classrooms: ");
        for (Classroom classroom : classrooms) {
            System.out.println(classroom.toString());
        }
    }
}
