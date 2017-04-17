package com.src.school.SchoolManagement.models;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.src.school.SchoolManagement.models.StudentRegistration;

@Repository
@Transactional
public class StudentRegistrationDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
	    return sessionFactory.getCurrentSession();
	  }


	  public void save(StudentRegistration e) {
		  System.out.println("Before Save "+e);
	    getSession().save(e);
	    return;
	  }
	  
	  public void delete(StudentRegistration e) {
	    getSession().delete(e);
	    return;
	  }
	  @SuppressWarnings("unchecked")
	public List<StudentRegistration> getAll(){
		    return getSession().createQuery("from StudentRegistration").list();

	  }

	  public StudentRegistration getByJob(int applicationNo) {
	    return (StudentRegistration) getSession().createQuery(
	        "from StudentRegistration where applicationNo = :applicationNo")
	        .setParameter("applicationNo", applicationNo)
	        .uniqueResult();
	  }

	  public StudentRegistration getById(long id) {
	    return (StudentRegistration) getSession().load(StudentRegistration.class, id);
	  }

	  public void update(StudentRegistration e) {
	    getSession().update(e);
	    return;
	  }

	} 


	  

	
