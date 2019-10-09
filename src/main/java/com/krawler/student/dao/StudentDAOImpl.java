package com.krawler.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.krawler.Student;

public class StudentDAOImpl implements StudentDAO {
	
	String url = "jdbc:mysql://192.168.0.232:3306/staging_10sept";
	public Student getStudent(String uname) throws Exception {
		
		Student st = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, "root", "Root@123");
		PreparedStatement stmt = conn.prepareStatement("select * from students where uname = ? ");
		stmt.setString(1, uname);
		
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			st = new Student(rs.getString("id"),rs.getString("uname"),rs.getString("food"));
		}
		return st;
	}

}
