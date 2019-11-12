package com.company.service.impl;

import java.util.List;

import org.junit.Test;

import com.company.bean.User;
import com.company.dao.IUserDao;
import com.company.dao.impl.UserDaoImpl;
import com.company.service.IUserService;

/**
 * @author Johnny
 * @category 用户业务逻辑实现类
 */
public class UserServiceImpl implements IUserService {

	/**
	 * 创建数据访问实现类对象
	 */
	private IUserDao userDao = new UserDaoImpl();

	@Test
	public void test() {
		User user = new User("zhuangzhuang", "123"); 
		System.out.println(save(user));
	}

	@Override
	public User find(String userName, String passWord) {
		User user = null;
		if (userName != null && passWord != null) {
			user = userDao.find(userName, passWord);
		}
		return user;
	}

	@Override
	public boolean save(User user) {
		return userDao.save(user) > 0 ? true : false;
	}

	@Override
	public boolean save(String name, String pass, String year, String month, String date, String age, String sex,
			String tel, String ip, String provinceId, String cityId, String areaId) {

		return false;
	}

	@Override
	public List<User> findUserList() {

		return null;
	}

	@Override
	public User find(int id) {

		return null;
	}

	@Override
	public boolean delete(int id) {

		return false;
	}

	@Override
	public boolean update(int id, String name, String pass, String year, String month, String date, String age,
			String sex, String tel, String provinceId, String cityId, String areaId) {

		return false;
	}

	@Override
	public boolean find(String name) {

		return false;
	}

}
