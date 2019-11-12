package com.company.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Johnny
 * @category 数据访问的基类
 */
public class BaseDao {

	/**
	 * 连接对象
	 */
	protected Connection conn;
	
	/**
	 * 预编译指令
	 */
	protected PreparedStatement pstmt;
	
	/**
	 * 结果集
	 */
	protected ResultSet rs;
	
	/**
	 * 注册（加载驱动）
	 */
	protected void regist(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 连接
	 */
	protected void connection(){
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanager", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 得到预编译指令
	 * @param sql
	 */
	protected void getPst(String sql){
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 关闭
	 */
	protected void close(){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}












