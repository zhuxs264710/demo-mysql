package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;


@RestController
public class DemoController {
	@Autowired
	DemoService demoService;

	@PostMapping(value = "/insertrandom")
	public int insertDemoRandom() {
		
		return demoService.insertDemo(this.randomEntity());
	}
	
	@PostMapping(value="/insert",headers = "content-type=application/json")
	public int insertDemo(@RequestBody DemoEntity entity) {
		
		return demoService.insertDemo(entity);
		
		
	}

	
	
	@PostMapping(value="/insertform",headers = "content-type=multipart/form-data")
	public int insertDemoForm(DemoEntity entity) {
		
		return demoService.insertDemo(entity);
		
		
	}

	@GetMapping(value = "/get/{id}")
	@ResponseBody
	public DemoEntity getDemoEntityById(@PathVariable("id") int id) {
		DemoEntity entity = demoService.getDemoById(id);
		return entity;
	}
	
	@GetMapping(value = "/get/all")
	@ResponseBody
	public List<DemoEntity> getAllDemoEntity() {
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
