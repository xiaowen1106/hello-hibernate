package com.znz.hellohibernate.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	private Long id;
	
	@Embedded
	@Getter
	private Address address;

	@Getter
	private String name;
}
