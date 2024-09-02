package com.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionService {
	Connection con;
	Statement st;
	public TransactionService(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","bhushan","Bhushan@25");
			st=con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public int deposit(String accNo,int depAmt) {
		int totalAmt=0;
		try {
			int rowCount=st.executeUpdate("update account set BALANCE= BALANCE + " + depAmt + " where ACCNO ='"+ accNo +"'");
			ResultSet rs=st.executeQuery("select * from account where ACCNO='"+accNo+"' ");
			rs.next();
			totalAmt=rs.getInt("BALANCE");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return totalAmt;
	}
}
