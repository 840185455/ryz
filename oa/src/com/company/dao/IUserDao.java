package com.company.dao;

import java.util.List;

import com.company.bean.User;

/**
 * @author Johnny
 * @category 数据访问层的接口
 */
public interface IUserDao {
	
	/**
	 * 查询出来所有的人员集合，除了管理员以外
	 */
	public List<User> findUserList();

	/**
	 * 根据用户名和密码返回用户对象
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public User find(String userName,String passWord);
	
	/**
	 * 简单注册
	 * @param user
	 * @return
	 */
	public int save(User user);
	
	/**
	 * 详情注册
	 * @param user
	 * @return
	 */
	public int saveInfo(User user);
	
	/**
	 * 通过Id查询出该人的信息
	 * @param id
	 * @return
	 */
	public User find(int id);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * 根据用户的ID删除对应的用户
	 * @param id
	 * @return
	 */
	public int delete(int id);
	
	/**
	 * 根据用户名，查询该用户名是否已经存在
	 */
	public User find(String name);
}
