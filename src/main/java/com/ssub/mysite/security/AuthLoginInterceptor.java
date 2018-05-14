package com.ssub.mysite.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//import com.ssub.mysite.service.UserService;
import com.ssub.mysite.vo.UserVo;

public class AuthLoginInterceptor extends HandlerInterceptorAdapter {
	/*s*/
	
	@Override
	public boolean preHandle(
		HttpServletRequest request, 
		HttpServletResponse response, 
		Object handler)
		throws Exception {

		String email = request.getParameter( "email" );
		String password = request.getParameter( "password" );
		
//		ApplicationContext ac = 
//		WebApplicationContextUtils.
//		getWebApplicationContext(request.getServletContext());
//		UserService userService = 
//				ac.getBean( UserService.class );
		
		//sUserVo userVo = userService.getUser(email, password);
		
		/*if( userVo == null ) {
			response.sendRedirect( request.getContextPath() + "/user/login" );
			return false;
		}*/
		
		// session 처리
		HttpSession session = request.getSession( true );
		//ssession.setAttribute( "authUser", userVo );
		response.sendRedirect( request.getContextPath() );

		return false;
	}

}
