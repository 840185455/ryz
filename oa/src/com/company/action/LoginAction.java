package com.company.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.User;
import com.company.service.IUserService;
import com.company.service.impl.UserServiceImpl;

/**
 * @author Johnny
 * @category 登录控制器
 */
@WebServlet(description = "登录", urlPatterns = { "/login.action" })
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//创建业务逻辑对象
		IUserService userService = new UserServiceImpl();
		// 设置字符集
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 获取前台的参数
		String name = request.getParameter("n");// 用户名
		String pass = request.getParameter("p");// 密码
		// 传递给业务逻辑对象+的到返回值
		User user = userService.find(name, pass);
		//根据返回的记过进行判断， 页面转发跳转
		if(user!=null){
			//登录成功+放入session中
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			//转发到登录成功的页面
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else{
			//转发到登录页面
			String mess = "用户名或密码错误";
			request.setAttribute("mess", mess);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);// 使用了委托
	}

}



























