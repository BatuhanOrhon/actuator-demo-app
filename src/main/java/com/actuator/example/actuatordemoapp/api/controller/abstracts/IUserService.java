package com.actuator.example.actuatordemoapp.api.controller.abstracts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.actuator.example.actuatordemoapp.api.rest.request.CreateUserRequest;
import com.actuator.example.actuatordemoapp.api.rest.request.FindUserRequest;
import com.actuator.example.actuatordemoapp.api.rest.response.FindUserResponse;


public interface IUserService {
	@GetMapping(value= "/hello")
	@ResponseBody
	public String hello();
	
	@PostMapping(value= "/createUser")
	@ResponseBody
	public String createUser(@RequestBody CreateUserRequest request);
	
	@PostMapping(value= "/findUser")
	@ResponseBody
	public FindUserResponse findUser(@RequestBody FindUserRequest request);
}
