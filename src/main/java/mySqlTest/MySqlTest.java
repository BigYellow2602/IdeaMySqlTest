package mySqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlTest {

    public static void main(String[] args) {
        String JDBC_Driver = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/DOUBLECOLOUR?useSSL=false";

        String USER = "root";
        String PASS = "Liuqingxun";

        try {
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS) ;
            System.out.println("連接成功");
            Statement stmt = conn.createStatement() ;
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
