package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;


@RestController
public class DemoController {
	@Autowired
	DemoService demoService;

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	int insertDemo(DemoEntity entity) {
		
		int id = demoService.insertDemo(this.randomEntity());
		return id;
	}

	@GetMapping(value = "/get/{id}")
	@ResponseBody
	DemoEntity getDemoEntityById(@PathVariable("id") int id) {
		DemoEntity entity = demoService.getDemoById(id);
		return entity;
	}
	
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	@ResponseBody
	List<DemoEntity> getAllDemoEntity() {
		List<DemoEntity> entitys = demoService.getAllDemo();
		return entitys;
	}

	private DemoEntity randomEntity() {
		Date date = new Date();
		DemoEntity entity = new DemoEntity(null,UUID.randomUUID().toString(), UUID.randomUUID().toString(), date, UUID.randomUUID().toString(), UUID.randomUUID().toString(), date,
				UUID.randomUUID().toString(), UUID.randomUUID().toString(), date, UUID.randomUUID().toString(), UUID.randomUUID().toString(), date, 
				UUID.randomUUID().toString(), UUID.randomUUID().toString(), date, UUID.randomUUID().toString(), 
				UUID.randomUUID().toString(), date, UUID.randomUUID().toString(), UUID.randomUUID().toString(),
				date);
		return entity;
	}

}
