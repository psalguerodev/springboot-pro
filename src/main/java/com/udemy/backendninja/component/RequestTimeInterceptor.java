package com.udemy.backendninja.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter{

	public static final Log LOGGER = LogFactory.getLog(RequestTimeInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		long starTime = (long) request.getAttribute("startTime");
		LOGGER.info("REQUEST URL: " + request.getRequestURL().toString());
		LOGGER.info("REQUEST TIME : " + (System.currentTimeMillis() - starTime) + " ms." );
		LOGGER.info("REQUEST ADDRESS: " + request.getRemoteAddr()  );
		LOGGER.info("REQUEST HOST: " + request.getRemoteHost() );
	}
	
}
