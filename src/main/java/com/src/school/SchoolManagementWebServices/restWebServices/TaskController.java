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

import com.src.school.managemnt.entitys.dao.TaskDtlsDao;
import com.src.school.managemnt.entitys.models.TaskDtls;

 

@Component
@Path("/TaskController")
public class TaskController {

 
	@Autowired
	private TaskDtlsDao taskDtlsDao;

	@POST
	@Path("/TaskRegister")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response schoolRegister(TaskDtls taskDtls) {
		System.out.println("In side taskDtlsDao  "+taskDtls);
		System.out.println(taskDtlsDao.getAll());

		try{
			System.out.println(taskDtlsDao.getAll());
			taskDtlsDao.save(taskDtls);
			
		}catch(Exception e){
			e.printStackTrace();
			 return Response.status(400).entity("Error occured").build();

		}
		System.out.println("After Catch");
		 return Response.status(200).entity("Success").build();
	}
	
	
	
	@GET
	@Path("/getAllTasks")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllRegisteredStudents() {
		List<TaskDtls> allTasks=new ArrayList<TaskDtls>();
		try{
			allTasks =taskDtlsDao.getAll();
			System.out.println(allTasks);
			 return Response.status(200).entity(allTasks).build();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("After Catch");
		 return Response.status(400).entity(allTasks).build();
	}

}
