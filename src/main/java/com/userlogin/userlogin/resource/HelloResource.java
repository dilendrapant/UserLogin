package com.userlogin.userlogin.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class HelloResource 
{
	@GetMapping("/all")
	String hello() {
		
		return "Hello Rest user!!";
	}
	
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/secured/all")
	String securedResource() {
		return "This is secured resource!!";
	}

}
