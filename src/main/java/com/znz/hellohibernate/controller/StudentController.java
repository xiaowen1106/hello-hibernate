package com.znz.hellohibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.znz.hellohibernate.dao.GuideDao;
import com.znz.hellohibernate.dao.StudentDao;
import com.znz.hellohibernate.entity.Guide;
import com.znz.hellohibernate.entity.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private GuideDao guideDao;
	
	@Autowired
	private StudentDao studentDao;

	@RequestMapping(method=RequestMethod.POST)
	public Student create(@RequestParam String enrollmentId, @RequestParam String name, @RequestParam Long guideId) {
		Guide guide = guideDao.findOne(guideId);
		Student student = new Student(name, enrollmentId, guide);
		return studentDao.save(student);
	}
	
}
