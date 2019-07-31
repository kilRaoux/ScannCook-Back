package com.scanncook.services.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.User;
import com.scanncook.repositories.user.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAll(){
		return userRepository.findAll();
	}
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public Optional<User> getById(Long id) {
		return userRepository.findById(id);
	}
	
	public Optional<User> getByTitle(String title){
		return userRepository.findByFirstname(title);
	}
	
	public void delete(User user) {
		userRepository.delete(user);
	}
}
