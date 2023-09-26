package com.actuator.example.actuatordemoapp.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.actuator.example.actuatordemoapp.model.entity.ActuatorUser;
import com.actuator.example.actuatordemoapp.model.repository.ActuatorUserRepository;

@Service
public class UserService {
	@Autowired
	ActuatorUserRepository repository;

	public void create(String name, String surname) {
		ActuatorUser user = new ActuatorUser();
		user.setName(name);
		user.setSurname(surname);
		repository.save(user);
	}
	
	public ActuatorUser find(Long id) {
		var repoResponse = repository.findById(id);
		return repoResponse.get();
	}
}
