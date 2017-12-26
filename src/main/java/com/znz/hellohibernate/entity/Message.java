package com.znz.hellohibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "message")
@NoArgsConstructor
@ToString
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	@Getter
	private Long id;

	@Column(name = "TEXT")
	@Setter
	@Getter
	private String text;

	public Message(String text) {
		this.text = text;
	}

}
