package com.qf.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Oracle_Jdbc {
    public static void main(String[] args) throws Exception {
        String driven="oracle.jdbc.driver.OracleDriver";
        String url="jdbc:oracle:thin:@10.0.127.235:1521:JAVA1715";
        Class.forName(driven);
        Connection connection= DriverManager.getConnection(url,"system","xph666");
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM t_student");
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
        }
        resultSet.close();
        connection.close();
        statement.close();










    }
}
