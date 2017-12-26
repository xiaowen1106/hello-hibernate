package com.znz.hellohibernate.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.znz.hellohibernate.entity.Person;

@Transactional
public interface PersonDao extends JpaRepository<Person, Long> {

}
