package vn.edu.likelion.connectDB;

import vn.edu.likelion.connectDB.Model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

public class ConvertFileToDB {
    static List<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        Date attendDate = new Date();
        int choice;
        Connect conn = new Connect();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (login(conn, statement, resultSet)) {
            do {
                System.out.println("*********************MENU*********************");
                System.out.println("1.Đọc file txt và insert vào table Student trong db");
                System.out.println("2.Điểm danh");
                System.out.println("3.Show học viên đi học");
                System.out.println("4.Show học viên cúp học");
                System.out.println("0.Thoát");
                System.out.print("Chọn chức năng: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        insertStudentDB(conn, statement, resultSet);
                        break;
                    case 2:
                        setAttendance(conn, statement, resultSet);
                        break;
                    case 3:
                        getAttendance(conn, statement, resultSet);
                        break;
                    case 4:
                        getAbsence(conn, statement, resultSet);
                        break;
                    case 0:
                        break;
                }
            } while (choice >= 0 && choice < 5);
        }

//        Attendance(conn, statement, resultSet);
    }

    public static boolean login(Connect conn, PreparedStatement statement, ResultSet resultSet) {
        String usName, pwd;
        try {
            String query = "select username, password from useracc";
            conn.openConnect();
            statement = conn.getConnect().prepareStatement(query);
            resultSet = statement.executeQuery(query);
            System.out.println("Đăng nhập để thực hiện chức năng");
            System.out.print("Username: ");
            usName = sc.next();
            System.out.print("Password: ");
            pwd = sc.next();
            while (resultSet.next()) {
                String q1 = resultSet.getString("username");
                String q2 = resultSet.getString("password");
                if (usName.equals(q1) && pwd.equals(q2)) {
                    System.out.println("Đăng nhập thành công");

                } else {
                    System.out.println("Sai thông tin đăng nhập");
                    return false;
                }
            }
//            statement.setString(1, "teacher1");
//            statement.setString(2, conn.password);
//            statement.setString(3, role_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void insertStudentDB(Connect conn, PreparedStatement statement, ResultSet resultSet) throws SQLException {
        conn.openConnect();
        //Drop data table Student
        String queryTruncate = "TRUNCATE TABLE STUDENT";
        try {
            statement = conn.getConnect().prepareStatement(queryTruncate);
            statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //Read and Insert data
        try {
            String query = "insert into STUDENT values (?,?,?)";
            //Send query to db
            statement = conn.openConnect().prepareStatement(query);
            BufferedReader reader = null;
            String inputFileName = "StudentsList.txt";
            String arr[];
            int result = 0;

            try {
                //Read studentListFile.txt file
                reader = new BufferedReader(new FileReader(inputFileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    //split
                    arr = line.split("\t");
                    statement.setInt(1, Integer.parseInt(arr[0]));
                    statement.setString(2, arr[1]);
                    statement.setInt(3, Integer.parseInt(arr[2]));
                    result = statement.executeUpdate();
                    students.add(new Student(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2])));

                }
//                for(Student student:students){
//                    System.out.println(student.getStudentId() + " " +student.getFullName());
//                }
                if (result > 0) {
                    System.out.println("Insert OK");
                    System.out.println("-------------------------");
                }
            } catch (IOException io) {
                io.printStackTrace();
            } finally {
                reader.close();
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.closeConnect();
                if (statement != null) statement.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getAttendance(Connect conn, PreparedStatement statement, ResultSet resultSet) {
        try {
            String queryAttendance = "select * from attendance where status = 1";
            //Send query to db
            statement = conn.openConnect().prepareStatement(queryAttendance);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("fullname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getAbsence(Connect conn, PreparedStatement statement, ResultSet resultSet) {
        try {
            String queryAttendance = "select * from Attendance where status = 0";
            //Send query to db
            statement = conn.openConnect().prepareStatement(queryAttendance);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("fullname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void setAttendance(Connect conn, PreparedStatement statement, ResultSet resultSet) {
        try {
            int result = 0;
            int diemDanh;
            Scanner scanner = new Scanner(System.in);
//            String query = "select * from student";
            //Send query to db
            String queryAttend = "Insert into Attendance(?,?,?,?)";
            statement = conn.openConnect().prepareStatement(queryAttend);
//            while (resultSet.next()) {

            for (Student student : students) {
                System.out.println("Điểm danh học viên " + student.getFullName() +
                        " 0(vắng) hoặc 1(có mặt): ");
                diemDanh = scanner.nextInt();
                statement.setInt(1, student.getStudentId());
                statement.setInt(2, diemDanh);
                statement.setDate(3, java.sql.Date.valueOf(LocalDate.now()));
                result = statement.executeUpdate();
//                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.closeConnect();
                if (statement != null) statement.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException s) {
                s.printStackTrace();
            }
        }
    }
}

