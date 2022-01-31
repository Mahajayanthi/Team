package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired 
	private StudentRepository repo;
	public Student save(Student stu) {
		return repo.save(stu);
	}
	

	public Student getStudentBystuId(int stuId) {
	
		return repo.getStudentBystuId(stuId);
	}


	public Student updateStudent(Student stu) {
	
		return repo.save(stu);
	}
	public Student deleteStudentBystuId(int stuId) {
		
		return repo.deleteStudentBystuId(stuId);
	}
	

}
