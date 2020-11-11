package com.example.demo.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "demo")
public class DemoEntity {

	

	public DemoEntity(Integer id, String a1, String a2, Date a3, String a4, String a5, Date a6, String a7, String a8,
			Date a9, String a10, String a11, Date a12, String a13, String a14, Date a15, String a16, String a17,
			Date a18, String a19, String a20, Date a21) {
		super();
		this.id = id;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
		this.a6 = a6;
		this.a7 = a7;
		this.a8 = a8;
		this.a9 = a9;
		this.a10 = a10;
		this.a11 = a11;
		this.a12 = a12;
		this.a13 = a13;
		this.a14 = a14;
		this.a15 = a15;
		this.a16 = a16;
		this.a17 = a17;
		this.a18 = a18;
		this.a19 = a19;
		this.a20 = a20;
		this.a21 = a21;
	}

	@Column(name = "id", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
	private Integer id;

	@Column(name = "a1", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a1;

	@Column(name = "a2", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a2;

	@Column(name = "a3", type = MySqlTypeConstant.DATETIME)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date a3;

	@Column(name = "a4", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a4;

	@Column(name = "a5", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a5;

	@Column(name = "a6", type = MySqlTypeConstant.DATETIME)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date a6;

	@Column(name = "a7", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a7;

	@Column(name = "a8", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a8;

	@Column(name = "a9", type = MySqlTypeConstant.DATETIME)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date a9;

	@Column(name = "a10", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a10;

	@Column(name = "a11", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a11;

	@Column(name = "a12", type = MySqlTypeConstant.DATETIME)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date a12;

	@Column(name = "a13", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a13;

	@Column(name = "a14", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a14;

	@Column(name = "a15", type = MySqlTypeConstant.DATETIME)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date a15;
	
	@Column(name = "a16", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a16;
	
	@Column(name = "a17", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a17;
	
	@Column(name = "a18",type = MySqlTypeConstant.DATETIME)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date a18;
	
	@Column(name = "a19", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a19;
	
	@Column(name = "a20", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String a20;
	
	@Column(name = "a21",type = MySqlTypeConstant.DATETIME)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date a21;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public Date getA3() {
		return a3;
	}

	public void setA3(Date a3) {
		this.a3 = a3;
	}

	public String getA4() {
		return a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
	}

	public String getA5() {
		return a5;
	}

	public void setA5(String a5) {
		this.a5 = a5;
	}

	public Date getA6() {
		return a6;
	}

	public void setA6(Date a6) {
		this.a6 = a6;
	}

	public String getA7() {
		return a7;
	}

	public void setA7(String a7) {
		this.a7 = a7;
	}

	public String getA8() {
		return a8;
	}

	public void setA8(String a8) {
		this.a8 = a8;
	}

	public Date getA9() {
		return a9;
	}

	public void setA9(Date a9) {
		this.a9 = a9;
	}

	public String getA10() {
		return a10;
	}

	public void setA10(String a10) {
		this.a10 = a10;
	}

	public String getA11() {
		return a11;
	}

	public void setA11(String a11) {
		this.a11 = a11;
	}

	public Date getA12() {
		return a12;
	}

	public void setA12(Date a12) {
		this.a12 = a12;
	}

	public String getA13() {
		return a13;
	}

	public void setA13(String a13) {
		this.a13 = a13;
	}

	public String getA14() {
		return a14;
	}

	public void setA14(String a14) {
		this.a14 = a14;
	}

	public Date getA15() {
		return a15;
	}

	public void setA15(Date a15) {
		this.a15 = a15;
	}

	public String getA16() {
		return a16;
	}

	public void setA16(String a16) {
		this.a16 = a16;
	}

	public String getA17() {
		return a17;
	}

	public void setA17(String a17) {
		this.a17 = a17;
	}

	public Date getA18() {
		return a18;
	}

	public void setA18(Date a18) {
		this.a18 = a18;
	}

	public String getA19() {
		return a19;
	}

	public void setA19(String a19) {
		this.a19 = a19;
	}

	public String getA20() {
		return a20;
	}

	public void setA20(String a20) {
		this.a20 = a20;
	}

	public Date getA21() {
		return a21;
	}

	public void setA21(Date a21) {
		this.a21 = a21;
	}

	

}
