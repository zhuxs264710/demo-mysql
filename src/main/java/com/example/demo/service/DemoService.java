package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.DemoEntity;

public interface DemoService {
	
	public int insertDemo(DemoEntity entity);
	
	public DemoEntity getDemoById(int id);
	
	public List<DemoEntity> getAllDemo();

}
