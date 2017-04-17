package com.src.school.SchoolManagementWebServices.restWebServices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.src.school.SchoolManagement.models.Employee;
import com.src.school.SchoolManagement.models.EmployeeDao;
import com.src.school.managemnt.entitys.models.Employees;


@Component
@Path("/office/EmployeeDetails")
public class EmployeeDetailsController {

	private final AtomicLong counter = new AtomicLong();
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;

	@Autowired
	private EmployeeDao employeedao;

	@GET
	@Path("/saveEmployeeDetails")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public String saveEmployeeDetails(
			@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
		System.out.println(" Hello");
		Employee e = new Employee();
		e.setName(name);
		e.setId(1000 + counter.incrementAndGet());
		e.setJob("S/W Engineer");
		employeedao.save(e);
		return "Employee :" + name + " Job: " + e.getJob() + "  Added Successfuly";
	}

	@GET
	@Path("/getAllStudentDetails")
	@Produces(MediaType.APPLICATION_JSON_VALUE)

	
	public List<Employee> getAllEmployeeDetails() {
		System.out.println(" Hello");

		List<Employee> allEmployees = employeedao.getAll();
		System.out.println("Size " + allEmployees.size());

		System.out.println("allEmployees  :" + allEmployees);

		return allEmployees;
	}
	
	
	@GET
	@Path("/getAllEmpDtls")
	@Produces(MediaType.APPLICATION_JSON_VALUE)

	
	public String  getAllEmpDtls() {
		System.out.println(" Hello");
		String allEmployees = getFile("F://HATS//GeeniBasketUI//SchoolUI//src//assets//EmployeeData.json").toString();
		JSONObject xmlJSONObj = null;
		Employees ronaldo =null;
		try {
              xmlJSONObj = XML.toJSONObject(allEmployees);
            
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
 
		//return Response.status(201).entity(ronaldo).build();
		
		return xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
	}
	
	private StringBuffer getFile(String FileName) {

		BufferedReader br = null;
		FileReader fr = null;
		StringBuffer sbFileContent = new StringBuffer();

		try {
			fr = new FileReader(FileName);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FileName));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				sbFileContent.append(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return sbFileContent;
	}
}
