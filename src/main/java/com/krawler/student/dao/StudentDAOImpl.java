package com.krawler.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.krawler.Student;

public class StudentDAOImpl implements StudentDAO {
	
	String url = "jdbc:mysql://localhost:3306/logindemo";
	public Student getStudent(int id) throws Exception {
		
		Student st = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url);
		PreparedStatement stmt = conn.prepareStatement("select * from students where id = ? ");
		stmt.setString(1, id+"");
		
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			
		}		
		return st;
	}

}
