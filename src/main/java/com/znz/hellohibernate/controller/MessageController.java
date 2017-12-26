package com.znz.hellohibernate.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.znz.hellohibernate.dao.MessageDao;
import com.znz.hellohibernate.entity.Message;

@RestController
@RequestMapping("/messages")
public class MessageController {
	
	@Autowired
	private MessageDao messageDao;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Message> retrieve() {
		return (Collection<Message>) messageDao.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Message retrieve(@PathVariable Long id) {
		return messageDao.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Message create(@RequestBody String text) {
		Message message = new Message(text);
		messageDao.save(message);
		return message;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public Message update(@PathVariable Long id, @RequestBody String text) {
		Message message = messageDao.findOne(id);
		message.setText(text);
		return messageDao.save(message);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable Long id) {
		messageDao.delete(id);
	}
}
