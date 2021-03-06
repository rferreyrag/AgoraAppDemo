package com.agora.service;

import javax.validation.Valid;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.agora.Exception.UsernameOrIdNotFound;
import com.agora.entity.User;
import com.agora.entity.dto.ChangePasswordForm;

public interface UserService {
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
	
	
	public User getUserById(Long id) throws Exception;

	public User updateUser(User user) throws Exception; 
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm form) throws Exception;
}
