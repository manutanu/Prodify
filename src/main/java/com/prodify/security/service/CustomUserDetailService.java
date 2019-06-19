package com.prodify.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.prodify.security.model.CustomUserDetails;
import com.prodify.security.model.User;
import com.prodify.security.repository.UserDataRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserDataRepository userDataRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionaluser=userDataRepository.findByUsername(username);
		System.out.println(optionaluser.get().getUser_password());
		optionaluser.orElseThrow(() -> new UsernameNotFoundException(username + " this user is not found !"));
		
		CustomUserDetails user=optionaluser.map(users -> {
			return new CustomUserDetails(users);
		}).get();
		
		//user=new CustomUserDetails(optionaluser.get());
		
		return user;
	}

}
