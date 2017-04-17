package com.src.school.SchoolManagement.configs;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/WebService")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(com.src.school.SchoolManagementWebServices.restWebServices.EmployeeDetailsController.class);
        register(com.src.school.SchoolManagementWebServices.restWebServices.StudnetRegCtrl.class);
        register(com.src.school.SchoolManagementWebServices.restWebServices.StaffRegCtrl.class);
        register(com.src.school.SchoolManagementWebServices.restWebServices.UserCtrl.class);
        register(com.src.school.SchoolManagementWebServices.restWebServices.SchoolRegistrationController.class);
        register(com.src.school.SchoolManagementWebServices.restWebServices.TaskController.class);

    }
}