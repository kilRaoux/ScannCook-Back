package com.scanncook.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scanncook.models.User;
import com.scanncook.services.UserService;

import lombok.Delegate;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/id/{id}")
	public Optional<User> getById(@PathVariable Long id) {
		return userService.getById(id);
	}
	
	@GetMapping("/title/{title}")
	public Optional<User> getByTitle(@PathVariable String title){
		return null;
	}
	
	@PostMapping
	public void save(@RequestBody User user) {
		userService.save(user);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody User user) {
		userService.delete(user);
	}
}
