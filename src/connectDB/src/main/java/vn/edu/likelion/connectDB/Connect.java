package vn.edu.likelion.connectDB;

import java.sql.*;

public class Connect {
    //Access information
    String url = "jdbc:oracle:thin:@localhost:1521:orcl21";
    String user = "sys as SYSDBA";
    String password = "lenvo1202";

    Connection conn = null;

    public Connection openConnect() throws SQLException{
            //Open connection
            conn = DriverManager.getConnection(url, user, password);
            return conn;
    }
    public void closeConnect() throws SQLException{
        if(conn != null)
            conn.close();
    }
    public Connection getConnect(){
        return conn;
    }

}
