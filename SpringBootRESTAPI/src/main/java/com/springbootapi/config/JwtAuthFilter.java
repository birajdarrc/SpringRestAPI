package com.springbootapi.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.springbootapi.helper.JwtUtil;
import com.springbootapi.services.CustomUserDetailsService;

@Component
public class JwtAuthFilter extends OncePerRequestFilter{

	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requesttokenheader = request.getHeader("Authorization");
		String username = null;
		String jwtToken = null;
		if(requesttokenheader != null && requesttokenheader.startsWith("Bearer ")) {
			jwtToken = requesttokenheader.substring(7);
			try {
				username = jwtUtil.extractUsername(jwtToken);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			if(username != null && SecurityContextHolder.getContext().getAuthentication()==null) {
				UserDetails userDetails = customUserDetailsService.loadUserByUsername(username);
				UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails.getUsername(), null,userDetails.getAuthorities());
				authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			}else {
				System.out.println("Invalid token");
			}
		}
		filterChain.doFilter(request, response);
	}

}
