package com.actuator.example.actuatordemoapp.api.rest.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FindUserResponse {
	Long id;
	String name;
	String surname;
}
