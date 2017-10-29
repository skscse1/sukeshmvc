package com.lab.demo;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorHandler extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		Calendar cal= Calendar.getInstance();
		
		int dayofweek=cal.get(cal.DAY_OF_WEEK);
		
		if(dayofweek==7)
		{
			
			response.getWriter().write("The website is closed on Sunday Please try on some other day");
			
			return false;
			
		}
		return true;
	}
	
	
	

}
