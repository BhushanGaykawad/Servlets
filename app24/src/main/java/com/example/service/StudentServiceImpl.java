package com.example.service;

import com.example.beans.Student;
import com.example.dao.StudentDao;
import com.example.factory.StudentDaoFactory;

public class StudentServiceImpl implements StudentService {

	@Override
	public String addStudent(Student student) {
		StudentDao studentDao=StudentDaoFactory.getStudentDao();
		String status=studentDao.add(student);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		StudentDao studentDao=StudentDaoFactory.getStudentDao();
		Student student=studentDao.search(sid);
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		StudentDao studentDao=StudentDaoFactory.getStudentDao();
		String status=studentDao.update(student);
		return status;
	}

	@Override
	public String deleteStudent(String sid) {
		StudentDao studentDao=StudentDaoFactory.getStudentDao();
		String status=studentDao.delete(sid);
		return status;
	}

}
