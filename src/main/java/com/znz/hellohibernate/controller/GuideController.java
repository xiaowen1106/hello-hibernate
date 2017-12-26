package com.znz.hellohibernate.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.znz.hellohibernate.dao.GuideDao;
import com.znz.hellohibernate.entity.Guide;

@RestController
@RequestMapping("/guides")
public class GuideController {

	@Autowired
	private GuideDao guideDao;

	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public Guide retrive(@PathVariable Long id) {
		Guide guide = guideDao.findOne(id);
		return guide;
	}

	@RequestMapping(method = RequestMethod.POST)
	public Guide create(@RequestParam String staffId, @RequestParam String name, @RequestParam BigDecimal salary) {
		Guide guide = new Guide(staffId, name, salary);
		return guideDao.save(guide);
	}

}
