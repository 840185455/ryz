package com.company.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.company.bean.User;
import com.company.dao.IUserDao;

/**
 * @author Johnny
 * @category 用户数据访问实现
 */
public class UserDaoImpl extends BaseDao implements IUserDao {

	@Override
	public List<User> findUserList() {
		
		return null;
	}

	@Override
	public User find(String userName, String passWord) {
		User user = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from user where name=? and pass=?";
			super.getPst(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, passWord);
			super.rs = pstmt.executeQuery();
			while(rs.next()){
				user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return user;
	}

	@Override
	public int save(User user) {
		int i = 0;
		try {
			super.regist();
			super.connection();
			String sql = "insert into user (name,pass) values (?,?)";
			super.getPst(sql);
			super.pstmt.setString(1, user.getName());
			super.pstmt.setString(2, user.getPass());
			i = super.pstmt.executeUpdate();//增加一个用户
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return i;
	}

	@Override
	public int saveInfo(User user) {
		
		return 0;
	}

	@Override
	public User find(int id) {
		
		return null;
	}

	@Override
	public int update(User user) {
		
		return 0;
	}

	@Override
	public int delete(int id) {
		
		return 0;
	}

	@Override
	public User find(String name) {
		
		return null;
	}

}
