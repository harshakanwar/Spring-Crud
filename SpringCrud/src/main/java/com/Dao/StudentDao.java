package com.Dao;

import java.util.List;

import com.api.Student;


// we use the model to send data from controller to view

public interface StudentDao {

     List<Student> loadStudents();
     void saveStudent(Student student);
     Student getStudent(int id);
	void update(Student student);
	void deleteStudent(int id);
}
