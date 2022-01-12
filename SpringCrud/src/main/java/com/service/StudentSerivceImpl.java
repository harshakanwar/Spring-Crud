package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Dao.StudentDao;
import com.api.Student;

@Service
public class StudentSerivceImpl implements StudentService {

	@Autowired
    private StudentDao studentDao;
	
	
	@Override
	public List<Student> loadStudents() {

		List<Student> studentList = studentDao.loadStudents();

		
		return studentList;
	}


	@Override
	public void saveStudent(Student student) {
		
		// write business logic
		
		if(student.getCountry().equals("UK")) {
			
			System.out.println(" Mail sent to " + student.getName());
		}
		

		studentDao.saveStudent(student);
		
	}


	@Override
	public Student getStudent(int id) {
		
		return studentDao.getStudent(id);
	}


	@Override
	public void update(Student student) {
		
		studentDao.update(student);
	}


	@Override
	public void deleteStudent(int id) {

		studentDao.deleteStudent(id);
		
	}

}
