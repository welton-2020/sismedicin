package com.iamspe.sismedicine.controller;

import com.iamspe.sismedicine.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.iamspe.sismedicine.dto.MessageRersponseDTO;
import com.iamspe.sismedicine.entity.User;

import lombok.Builder;

@Builder
@RestController
@RequestMapping("api/v1/user")
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MessageRersponseDTO createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	

}
