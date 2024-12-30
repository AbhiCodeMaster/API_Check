package com.cricket.ipl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/user")
public class TestController {
	
	
	@GetMapping(path = "/hi")
	public String sayHi() {
		return "hi Springboot";
		}
	
	@GetMapping(path = "/hello")
	public String sayHello() {
		
		return "hello Springboot";
	}
	
	@GetMapping(path = "/user")
	public User getUser() {
		User user = new User("abhinav chauhan","ac825473@gmail.com","8630211569","yes");
		return user;
	}

}
