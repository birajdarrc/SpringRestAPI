package com.springbootapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springbootapi.entity.Course;
import com.springbootapi.entity.TblCandidateinfo;
import com.springbootapi.modal.JwtRequest;
import com.springbootapi.services.CourseService;
import com.springbootapi.services.TblCandidateinfoService;

@RestController
public class HomeController {

	@Autowired
	private CourseService courseService;

	@Autowired
	private TblCandidateinfoService candidateinfoService;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/home")
	@CacheEvict(value = "candidates", allEntries=true)
	public String coursedata() {
		return "Hello";
	}
	

	@GetMapping(value = "/courses")
	public List<Course> getallcourses() {
		List<Course> courses = courseService.getAllCourses();
		return courses;
	}

	@GetMapping(value = "/candidates")
	@Cacheable(cacheNames = "candidates")
	public List<TblCandidateinfo> getallcandidates() {
		int i = 0;
		while(i==0) {}
		return candidateinfoService.allcandidate();		
	}


	@GetMapping(value = "/template/candidates")
	public List<Object> getallcandidatesTemplate() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
//		return candidateinfoService.allcandidate();
		return restTemplate.exchange(
		         "http://localhost:9090/candidates", HttpMethod.GET, entity, List.class).getBody();
		
	}

	@GetMapping(value = "/candidates/{id}")
	public TblCandidateinfo getcandidates(@PathVariable String id) {
		System.out.println(id);
		return candidateinfoService.getcandidate(Integer.parseInt(id));
	}

}
