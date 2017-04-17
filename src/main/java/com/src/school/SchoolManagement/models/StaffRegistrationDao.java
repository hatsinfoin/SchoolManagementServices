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
public class StaffRegistrationDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
	    return sessionFactory.getCurrentSession();
	  }


	  public void save(StaffRegistration e) {
		  System.out.println("Before Save "+e);
	    getSession().save(e);
	    return;
	  }
	  
	  public void delete(StaffRegistration e) {
	    getSession().delete(e);
	    return;
	  }
	  @SuppressWarnings("unchecked")
	public List<StaffRegistration> getAll(){
		    return getSession().createQuery("from StaffRegistration").list();

	  }

	  public StaffRegistration getByName(String staffName) {
	    return (StaffRegistration) getSession().createQuery(
	        "from StaffRegistration where staffName = :staffName")
	        .setParameter("staffName", staffName)
	        .uniqueResult();
	  }

	  public StaffRegistration getById(long id) {
	    return (StaffRegistration) getSession().load(StaffRegistration.class, id);
	  }

	  public void update(StaffRegistration e) {
	    getSession().update(e);
	    return;
	  }

	} 


	  

	
