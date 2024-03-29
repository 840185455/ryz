package com.company.bean;

import java.util.Date;

/**
 * @author Johnny
 * @category 用户实体类
 */
public class User {

	/**
	 * 主键
	 */
	private int id;

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 用户密码
	 */
	private String pass;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 生日
	 */
	private Date birthday;

	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 电话
	 */
	private String tel;

	/**
	 * 省（直辖市）
	 */
	private String provinceId;

	/**
	 * 市
	 */
	private String cityId;

	/**
	 * 区（县）
	 */
	private String areaId;

	/**
	 * 注册时间
	 */
	private Date inputdate;

	/**
	 * 注册的ip
	 */
	private String ip;

	public User() {
		super();
	}

	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	public User(int id, String name, String pass, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
	}

	public User(String name, String pass, String sex, Date birthday, int age, String tel, Date inputdate, String ip) {
		super();
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.birthday = birthday;
		this.age = age;
		this.tel = tel;
		this.inputdate = inputdate;
		this.ip = ip;
	}

	/**
	 * 增加了有省市区的构造方法
	 */
	public User(String name, String pass, String sex, Date birthday, int age, String tel, String provinceId,
			String cityId, String areaId, Date inputdate, String ip) {
		super();
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.birthday = birthday;
		this.age = age;
		this.tel = tel;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.areaId = areaId;
		this.inputdate = inputdate;
		this.ip = ip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public Date getInputdate() {
		return inputdate;
	}

	public void setInputdate(Date inputdate) {
		this.inputdate = inputdate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
