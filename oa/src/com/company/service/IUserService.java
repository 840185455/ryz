package com.company.service;

import java.util.List;

import com.company.bean.User;

/**
 * @author Johnny
 * @category 业务逻辑层接口
 */
public interface IUserService {

	/**
	 * 登录验证
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public User find(String userName, String passWord);

	/**
	 * 简单注册
	 * @param user
	 * @return
	 */
	public boolean save(User user);

	/**
	 * 详情注册
	 * @param user
	 * @return
	 */
	public boolean save(String name, String pass, String year, String month,
			String date, String age, String sex, String tel, String ip,
			String provinceId, String cityId, String areaId);

	/**
	 * 查询出来所有的人员集合，除了管理员以外
	 */
	public List<User> findUserList();

	/**
	 * 通过Id查询出该人的信息
	 * 
	 * @param id
	 * @return
	 */
	public User find(int id);

	/**
	 * 根据用户id删除用户
	 */
	public boolean delete(int id);

	/**
	 * 更新用户信息
	 */
	public boolean update(int id, String name, String pass, String year,
			String month, String date, String age, String sex, String tel,
			String provinceId, String cityId, String areaId);

	/**
	 * 根据用户名，查询该用户名是否已经存在
	 */
	public boolean find(String name);
}
