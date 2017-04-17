package com.src.SchoolManagementWebServices.restWebServices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.src.school.SchoolManagementServicesApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SchoolManagementServicesApplication.class)
@WebAppConfiguration
public class SchoolManagementServicesApplicationTests {

	@Test
	public void contextLoads() {
	}

}
