package com.actuator.example.actuatordemoapp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.actuator.example.actuatordemoapp.api.controller.abstracts.IUserService;
import com.actuator.example.actuatordemoapp.api.rest.request.CreateUserRequest;
import com.actuator.example.actuatordemoapp.api.rest.request.FindUserRequest;
import com.actuator.example.actuatordemoapp.api.rest.response.FindUserResponse;
import com.actuator.example.actuatordemoapp.service.service.UserService;

@RestController
public class UserServiceImpl implements IUserService{

	@Autowired
	UserService userService;
	
	@Override
	public String hello() {
		return "Hello world!";
	}

	@Override
	public String createUser(CreateUserRequest request) {
		userService.create(request.getName(), request.getSurname());
		return "User is created successfully";
	}
	
	@Override
	public FindUserResponse findUser(FindUserRequest request) {
		var response = new FindUserResponse();
		var serviceResponse = userService.find(request.getId());
		response.setId(serviceResponse.getId());
		response.setName(serviceResponse.getName());
		response.setSurname(serviceResponse.getSurname());
		return response;
	}

}
