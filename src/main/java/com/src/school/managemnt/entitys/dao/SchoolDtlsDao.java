package com.src.school.managemnt.entitys.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.src.school.managemnt.entitys.models.SchoolDtls;

@Repository
@Transactional
public class SchoolDtlsDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(SchoolDtls schoolDtls) {
		getSession().save(schoolDtls);
		return;
	}

	public void delete(SchoolDtls schoolDtls) {
		getSession().delete(schoolDtls);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<SchoolDtls> getAll() {
		return getSession().createQuery("from SchoolDtls").list();

	}
}
