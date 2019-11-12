package com.company.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author castle
 * @category 字符集过滤器
 */
@WebFilter("/*")
public class CharEnchodingFilter implements Filter {
	
	private final static String CHARENCHODING="utf-8";

    public CharEnchodingFilter() {
    	System.out.println("字符集——>过滤器的构造方法");
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
		System.out.println("过滤器——>过滤");
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		req.setCharacterEncoding(CHARENCHODING);
		res.setCharacterEncoding(CHARENCHODING);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("字符集——>过滤器创建");
	}

}
