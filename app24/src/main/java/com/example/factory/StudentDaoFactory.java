package com.example.factory;

import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;

public class StudentDaoFactory {

	private static StudentDao studentDao;
	static {
		studentDao=new StudentDaoImpl();
	}
	
	public static StudentDao getStudentDao() {
		return studentDao;
	}
}
