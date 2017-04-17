package com.src.school.SchoolManagement.models;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EmployeeDao{// extends HibernateDaoSupport{
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
	    return sessionFactory.getCurrentSession();
	  }


	  public void save(Employee e) {
	    getSession().save(e);
	    return;
	  }
	  
	  public void delete(Employee e) {
	    getSession().delete(e);
	    return;
	  }
	  @SuppressWarnings("unchecked")
	public List<Employee> getAll(){
		    return getSession().createQuery("from Employee").list();

	  }

	  public Employee getByJob(String job) {
	    return (Employee) getSession().createQuery(
	        "from Employee where job = :job")
	        .setParameter("job", job)
	        .uniqueResult();
	  }

	  public Employee getById(long id) {
	    return (Employee) getSession().load(Employee.class, id);
	  }

	  public void update(Employee e) {
	    getSession().update(e);
	    return;
	  }

	} 


	  

	
