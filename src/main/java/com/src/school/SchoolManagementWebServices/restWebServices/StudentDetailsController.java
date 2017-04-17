package com.src.school.SchoolManagementWebServices.restWebServices;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.src.school.SchoolManagement.models.Users;
import com.src.school.SchoolManagement.models.UserDao;

@Controller
@RequestMapping("/School/StudentDetails")
public class StudentDetailsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private UserDao _userDao;
    
    @RequestMapping(method=RequestMethod.GET,value = "saveStudentDetails")
    public @ResponseBody String saveStudentDetails(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
    	System.out.println(" Hello");
    	 Users user = new Users();
    	 user.setName(name);
    	 user.setId(1000+ counter.incrementAndGet());
    	 user.setEmail("moshaik.ali@gmail.com");
    	_userDao.save(user);
        return "Users :"+name+" Email: "+user.getEmail()+"  Added Successfuly" ;
    }

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "getAllStudentDetails")

    public @ResponseBody List<Users> getAllStudentDetails() {
    	System.out.println(" Hello");
    	 
    	List<Users> allStudents = _userDao.getAll();
    	System.out.println("Size "+allStudents.size());
    	
    	System.out.println("allStudents  :"+allStudents);
    	
        return allStudents;
    }


}