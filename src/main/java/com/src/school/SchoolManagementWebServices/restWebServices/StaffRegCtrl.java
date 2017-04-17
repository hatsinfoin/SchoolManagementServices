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

import com.src.school.SchoolManagement.models.StaffRegistration;
import com.src.school.SchoolManagement.models.StaffRegistrationDao;
 

@Component
@Path("/office/StaffRegistration")
public class StaffRegCtrl {

 
	@Autowired
	private StaffRegistrationDao staffRegistrationDao;

	@POST
	@Path("/StaffNewRegister")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response StaffRegistrationDao(StaffRegistration newStaffRegister) {
		System.out.println("In side StaffRegistrationDao "+newStaffRegister);
		System.out.println(" StaffRegistrationDao newStaffRegister "+newStaffRegister.getStaffName());
		
		try{
			staffRegistrationDao.save(newStaffRegister);
			System.out.println(staffRegistrationDao.getAll());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("After Catch");
		 return Response.status(200).entity("Success").build();
	}
	//getRegisteredStudents
	@GET
	@Path("/getRegisteredStaff")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllRegisteredStudents() {
		List<StaffRegistration> allRegStaff=new ArrayList<StaffRegistration>();
		try{
			allRegStaff =staffRegistrationDao.getAll();
			System.out.println(allRegStaff);
			 return Response.status(200).entity(allRegStaff).build();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("After Catch");
		 return Response.status(400).entity(allRegStaff).build();
	}

}
