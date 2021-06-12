package com.iamspe.sismedicine.controller;

import com.iamspe.sismedicine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.iamspe.sismedicine.dto.response.MessageRersponseDTO;
import com.iamspe.sismedicine.entity.User;
import com.iamspe.sismedicine.repository.UserRepository;

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
