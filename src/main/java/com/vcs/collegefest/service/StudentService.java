package com.vcs.collegefest.service;

import java.util.List;

import com.vcs.collegefest.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(long id);

	public void save(Student theStudent);

	public void deleteById(long id);

}
