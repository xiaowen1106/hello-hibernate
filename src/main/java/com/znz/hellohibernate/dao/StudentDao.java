package com.znz.hellohibernate.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.znz.hellohibernate.entity.Student;

@Transactional
public interface StudentDao extends JpaRepository<Student, Long> {

}
