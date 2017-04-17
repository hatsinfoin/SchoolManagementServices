package com.src.school.SchoolManagementWebServices.restWebServices;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.src.school.managemnt.entitys.models.user.User;
import com.src.school.managemnt.entitys.user.dao.UserDtlsDao;;
 

 
@Path("userDtls/user")
public class UserCtrl {

 
	@Autowired
	private UserDtlsDao userDao;

	@POST
	@Path("/saveUserDtls")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response UserNewRegister(User user) {
		System.out.println("In side user "+user);
 		
		try{
			userDao.save(user);
			System.out.println(userDao.getAll());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("After Catch");
		 return Response.status(200).entity("Success").build();
	}
	//getRegisteredStudents
	@GET
	@Path("/getUserDtls")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserDtls(@QueryParam ("userName")   String userName) {
		System.out.println("*********userName********* "+userName);
 		User allUsers = new  User ();
		try{
			allUsers =userDao.getUser(userName);
			System.out.println(allUsers);
			 return Response.status(200).entity(allUsers).build();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("After Catch");
		 return Response.status(400).entity(allUsers).build();
	}

	//getRegisteredStudents
	@POST
	@Path("/userValidate")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response userValidate(User user) {
		System.out.println("*********user********* "+user );
		System.out.println("*********userName********* "+user.getUserName());
		System.out.println("*********userName********* "+user.getPassword());
 		try{
			User severUser =userDao.getUser(user.getUserName());
			if(severUser != null && severUser.getUserName().equalsIgnoreCase(user.getUserName()) && severUser.getPassword().equals(user.getPassword() )){
				System.out.println("Authentication Successful");
				//return Response.status(200).entity("Successful").build();
				return Response.ok().build();
			} 
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Authentication Failed");

		 return Response.status(400).entity("UserID & Password are incorrect").build();

  	}
	
}
