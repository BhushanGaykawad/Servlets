package com.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.beans.Student;

public class StudentService {
	Connection con;
	 Statement st;
	ResultSet rs;
	public StudentService() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","bhushan","Bhushan@25");
			st=con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void addStudent(Student std) {
		try {
			st.executeUpdate("insert into student values ('"+std.getSid()+"','"+std.getSname()+"','"+std.getSaddr()+"')");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public List<Student>getAllStudents(){
		List<Student> stdList=null;
		try {
			rs=st.executeQuery("select * from student");
			stdList=new ArrayList<Student>();
			while(rs.next()) {
				Student std=new Student();
				std.setSid(rs.getString("sid"));
				std.setSname(rs.getString("sname"));
				std.setSaddr(rs.getString("saddr"));
				stdList.add(std);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return stdList;
		
	}
}
