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

import com.src.school.managemnt.entitys.dao.SchoolDtlsDao;
import com.src.school.managemnt.entitys.models.SchoolDtls;

 

@Component
@Path("/SchoolRegistration")
public class SchoolRegistrationController {

 
	@Autowired
	private SchoolDtlsDao schoolDtlsDao;

	@POST
	@Path("/SchoolNewRegister")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response schoolRegister(SchoolDtls schoolDtls) {
		System.out.println("In side SchoolDtlsDao  "+schoolDtls);
		//System.out.println(" StaffRegistrationDao newStaffRegister "+newStaffRegister.getStaffName());
		System.out.println(schoolDtlsDao.getAll());

		try{
			System.out.println(schoolDtlsDao.getAll());
			schoolDtlsDao.save(schoolDtls);
			
		}catch(Exception e){
			e.printStackTrace();
			 return Response.status(400).entity("Error occured").build();

		}
		System.out.println("After Catch");
		 return Response.status(200).entity("Success").build();
	}
	
	
	
	@GET
	@Path("/getRegisteredSchools")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllRegisteredStudents() {
		List<SchoolDtls> allSchools=new ArrayList<SchoolDtls>();
		try{
			allSchools =schoolDtlsDao.getAll();
			System.out.println(allSchools);
			 return Response.status(200).entity(allSchools).build();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("After Catch");
		 return Response.status(400).entity(allSchools).build();
	}

}
