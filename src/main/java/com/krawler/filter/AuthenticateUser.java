package com.krawler.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;


public class AuthenticateUser implements Filter {

    public AuthenticateUser() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req2 = (HttpServletRequest)request;
		HttpServletResponse res2 = (HttpServletResponse)response;
		
		HttpSession sessoin = req2.getSession();
		
		PrintWriter p = res2.getWriter();
		
		
		if (sessoin == null || sessoin.getAttribute("ssid") == null || sessoin.getAttribute("ssid") == "") {
			p.print("Pass");
			res2.sendRedirect("login.jsp");
		} else {
			p.print("Fail");			
			chain.doFilter(request, response);
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
