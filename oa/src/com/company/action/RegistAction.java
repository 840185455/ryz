package com.company.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.bean.User;
import com.company.service.IUserService;
import com.company.service.impl.UserServiceImpl;

/**
 * @author Johnny
 * @category 注册控制器
 */
@WebServlet("/registeasy.action")
public class RegistAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建业务逻辑对象
		IUserService userService = new UserServiceImpl();//Model
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//接收数据
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		User user = new User(name, pass);
		//调用业务逻辑的方法
		boolean flag = userService.save(user);
		//根据返回值进行响应
		if(flag){
			//保存成功
			response.sendRedirect("login.jsp");
		}else{
			//失败
			request.setAttribute("mess", "用户注册失败");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}




















