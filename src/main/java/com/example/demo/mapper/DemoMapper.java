package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.DemoEntity;

@Mapper
public interface DemoMapper{

	@Select("SELECT * FROM demo WHERE id = #{id}")
	DemoEntity findById(@Param("id") int id);
	
	@Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
	@Insert("INSERT INTO demo (a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21) "
			+ "VALUES(#{a1}, #{a2},#{a3}, #{a4},#{a5}, #{a6},#{a7}, #{a8},#{a9}, #{a10},#{a11}, #{a12},#{a13}, #{a14},"
			+ "#{a15}, #{a16},#{a17}, #{a18},#{a19}, #{a20},#{a21})")
	int insertDemoEntity(DemoEntity entity);
	@Select("SELECT * FROM demo")
	List<DemoEntity> getAll();
	
	
}
