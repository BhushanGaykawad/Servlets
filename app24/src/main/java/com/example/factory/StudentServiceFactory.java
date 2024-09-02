package com.example.factory;

import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;

public class StudentServiceFactory {
	private static StudentService studentService;
	static {
		studentService=new StudentServiceImpl();
	}
	
	public static StudentService getStudentService() {
		return studentService;
	}
	
	
}
