package com.znz.hellohibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	private Long id;

	@Getter
	private String name;

	@Column(name = "enrollment_id", nullable = false)
	@Getter
	private String enrollmentId;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "guide_id")
	@Setter
	@Getter
	private Guide guide;

	public Student(String name, String enrollmentId, Guide guide) {
		super();
		this.name = name;
		this.enrollmentId = enrollmentId;
		this.guide = guide;
	}

}
