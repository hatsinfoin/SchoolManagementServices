package com.src.school.SchoolManagementWebServices.restWebServices;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.school.SchoolManagement.models.StudentRegistration;
import com.src.school.SchoolManagement.models.StudentRegistrationDao;
 

@Component
@Path("office/StudentRegister")
public class StudnetRegCtrl {

 
	@Autowired
	private StudentRegistrationDao studentRegistrationDao;

	@POST
	@Path("/StudentNewRegister")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response StudentNewRegister(StudentRegistration newStudentRegister) {
		System.out.println("In side StudentNewRegister "+newStudentRegister);
		System.out.println(" StudnetRegCtrl newStudentRegister "+newStudentRegister.getDob());
		
		try{
			studentRegistrationDao.save(newStudentRegister);
			System.out.println(studentRegistrationDao.getAll());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("After Catch");
		 return Response.status(200).entity("Success").build();
	}
	//getRegisteredStudents
	@GET
	@Path("/getRegisteredStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllRegisteredStudents() {
		List<StudentRegistration> allRegStudents=new ArrayList<StudentRegistration>();
		try{
			 allRegStudents =studentRegistrationDao.getAll();
			System.out.println(allRegStudents);
			 return Response.status(200).entity(allRegStudents).build();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("After Catch");
		 return Response.status(400).entity(allRegStudents).build();
	}

}
