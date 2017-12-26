package com.znz.hellohibernate.entity;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Guide {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	private Long id;

	@Column(name = "staff_id", nullable = false)
	@Getter
	private String staffId;

	@Getter
	private String name;

	@Getter
	private BigDecimal salary;

	@OneToMany(mappedBy = "guide", cascade = CascadeType.PERSIST)
	@Getter
	@JsonIgnore
	private Set<Student> students;

	public void addStudent(Student student) {
		students.add(student);
		student.setGuide(this);
	}

	public Guide(String staffId, String name, BigDecimal salary) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.salary = salary;
	}

}
