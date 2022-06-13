package com.springbootapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootapi.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	private 
	
	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		List<Course> courses = new ArrayList<Course>();
		courses.add(new Course(1,"Java"));
		courses.add(new Course(2,"Spring"));
		return courses;
	}

}
