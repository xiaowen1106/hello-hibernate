package com.znz.hellohibernate.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

	@Getter
	private String street;
	
	@Getter
	private String city;
	
	@Getter
	private String zipcode;
}
