package com.example.service;
import java.sql.*;
import com.example.beans.Student;

public class StudentService 
{
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	
	public StudentService() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","bhushan","Bhushan@25");
			st=con.createStatement();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Student getStudent(String sid)
	{
		Student std=null;
		try {
			rs=st.executeQuery("select * from student where sid= '"+sid+"'");
			boolean b= rs.next();
			if(b==true)
			{
				std=new Student();
				std.setSid(rs.getString("SID"));
				std.setSname(rs.getString("SNAME"));
				std.setSaddr(rs.getString("SADDR"));
			}else {
				std=null;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return std;
	}
	
	public String updateStudent(Student std)
	{
		String status="";
		try {
			int rowCount=st.executeUpdate("update student set SNAME='"+std.getSname()+"',SADDR='"+ std.getSaddr()+"' where SID='"+std.getSid()+"'");
			if(rowCount==1) {
				status="success";
			}else {
				status="failure";
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}

}
