package com.springbootapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapi.helper.JwtUtil;
import com.springbootapi.modal.JwtRequest;
import com.springbootapi.modal.JwtResponse;
import com.springbootapi.services.CustomUserDetailsService;

@RestController
public class JwtController {

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@RequestMapping(value = "/token", method = RequestMethod.POST)
	public ResponseEntity<JwtResponse> genrateToken(@RequestBody JwtRequest request) {
		System.out.println(request);
		
		try {
			
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BadCredentialsException("Bad Credentials");
		}
		UserDetails details = this.customUserDetailsService.loadUserByUsername(request.getUsername());
		String token = this.jwtUtil.generateToken(details);
		System.out.println("token = "+token);
		return ResponseEntity.ok(new JwtResponse(token));
	}
}
