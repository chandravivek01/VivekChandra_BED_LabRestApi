package com.vcs.collegefest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Hibernate Managed POJO for Holding Student Credentials 
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private long id;

	private String firstName;

	private String lastName;

	private String course;

	private String country;
}
