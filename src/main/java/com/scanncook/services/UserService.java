package com.scanncook.services;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.User;
import com.scanncook.repositories.UserRepository;

@Service
public class UserService {

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
		return userRepository.findByTitle(title);
	}
	
	public void delete(User user) {
		userRepository.delete(user);
	}
}