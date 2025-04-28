package com.ust.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        String uname="root";
        String pwd="pass@word1";
        String url="jdbc:mysql://localhost:3306/ustdb";
        Connection con=DriverManager.getConnection(url,uname,pwd);
        System.out.println("connection created");
        
        String query="select * from usertable";
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery(query);
        
        while(rs.next()) {
        	int uid=rs.getInt(1);
        	String username=rs.getString(2);
        	String password=rs.getString(3);
        	String email=rs.getString(4);
        	int age=rs.getInt(5);
        	String userStatus=rs.getString(6);
        	System.out.println(uid+" "+username+" "+password+" "+email+" "+age+" "+userStatus);
        	
        }
        
    }
}
