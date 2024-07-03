package HomeWork.Service;

import HomeWork.Interface.SchoolInterface;
import HomeWork.Model.Classroom;
import HomeWork.Model.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class SchoolService implements SchoolInterface {
    //khởi tạo arrayList students
    public static ArrayList<Student> students = new ArrayList<>();
    //khởi tạo arrayList classrooms
    public static ArrayList<Classroom> classrooms = new ArrayList<>();


    //Student
    public void addStudents(Student student) {
        students.add(student);
    }

    //tìm Sinh viên theo id
    public Student getStudentById(int id) {
        return students.get(--id);
    }

    public void showStudents() {
        System.out.println("List students: ");
        //Duyệt từng phần tử trong list students
        for (Student student : students) {
            //xuất ra màn hình console
            System.out.println(student.toString());
        }
    }

    public void showDetailStudent(int id) {
        Student student = getStudentById(id);
        System.out.println(student.toString());
    }

    public void updateStudentInfo(int id, String name, LocalDate dob, String idCard) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setName(name);
            student.setDob(dob);
            student.setIdCard(idCard);
        }
    }

    public void removeStudent(int id, String dropReason){
        Student student = getStudentById(id);
        if (student != null) {
            student.setDropped(true);
            student.setDropReason(dropReason);
        }
        showDetailStudent(id);
    }
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
