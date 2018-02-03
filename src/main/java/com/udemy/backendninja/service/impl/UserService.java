package com.udemy.backendninja.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.entity.UserRole;
import com.udemy.backendninja.repository.UserRepository;

@Service("userService")
public class UserService implements UserDetailsService{

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.udemy.backendninja.entity.User user = this.userRepository.findByUsername(username);
		List<GrantedAuthority> authorities = this.buildAuthorities(user.getUserRole());
		return this.buildUser(user, authorities);
	}
	
	private User buildUser(com.udemy.backendninja.entity.User user , List<GrantedAuthority> authorities) {
		return new User(user.getUsername(),user.getPassword(), 
						user.isEnabled() , true, true , true, authorities);
	}
	
	private List<GrantedAuthority> buildAuthorities(Set<UserRole> userRole){
		Set<GrantedAuthority> auths = new HashSet<GrantedAuthority>();
		userRole.stream().forEach( u -> auths.add(new SimpleGrantedAuthority(u.getRole())) );
		return new ArrayList<GrantedAuthority>(auths);
	}

}
