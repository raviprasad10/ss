package com.capgemini.merchantstore.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.capgemini.merchantstore.beans.Merchant;
import com.capgemini.merchantstore.repo.UserDao;



@Service(value = "userDetailService")

public class UserDetailServiceImpl implements UserDetailsService{
	
	@Autowired(required = true)
	private UserDao userDao;

	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Merchant user = userDao.findUserByEmail(email);
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(String.valueOf(user.getMerchantId()), user.getPassword(), getAuthority());
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}



}
