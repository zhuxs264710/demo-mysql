package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DemoEntity;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.service.DemoService;
@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoMapper mapper;

	@Override
	public int insertDemo(DemoEntity entity) {
		mapper.insertDemoEntity(entity);
		
		return entity.getId();
	}

	@Override
	public DemoEntity getDemoById(int id) {
		DemoEntity entity = mapper.findById(id);
		return entity;
	}

	@Override
	public List<DemoEntity> getAllDemo() {
		List<DemoEntity> list = mapper.getAll();
		
		return list;
	}

}
