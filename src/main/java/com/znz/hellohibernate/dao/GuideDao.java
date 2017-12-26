package com.znz.hellohibernate.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.znz.hellohibernate.entity.Guide;

@Transactional
public interface GuideDao extends JpaRepository<Guide, Long> {

}
