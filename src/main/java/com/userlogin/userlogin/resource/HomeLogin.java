package com.userlogin.userlogin.resource;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeLogin {

	
	@GetMapping({"/","/login"})
	public void hello(HttpServletResponse response) throws IOException {
		
		response.sendRedirect("/home");
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/home")
	public void login(HttpServletResponse response) throws IOException {
		
		response.sendRedirect("/rest/hello/all");
	}
}
