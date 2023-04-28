package com.vcs.collegefest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcs.collegefest.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
