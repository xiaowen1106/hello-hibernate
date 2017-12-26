package com.znz.hellohibernate.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.znz.hellohibernate.entity.Message;

@Transactional
public interface MessageDao extends JpaRepository<Message, Long>{

}
