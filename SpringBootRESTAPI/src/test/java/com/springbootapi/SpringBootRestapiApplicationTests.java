package com.springbootapi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springbootapi.DAO.TblCandidateInfoDAO;

@SpringBootTest
class SpringBootRestapiApplicationTests {

	@Autowired
	private TblCandidateInfoDAO candidateInfoDAO;
	
	@Disabled
	@Test
	void contextLoads() {
	}
	
	@Test
	void myUserServiceTest() {
		long expected = 18l;
		long actual = candidateInfoDAO.count();
		System.out.println(actual);
		assertThat(actual).isEqualTo(expected);
	}
}
