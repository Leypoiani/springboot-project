package com.course.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.project.entities.User;
import com.course.project.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
	Optional<User> obj = userRepository.findById(id);
	return obj.get();
	}

}
