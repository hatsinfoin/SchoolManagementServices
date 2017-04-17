package com.src.school.managemnt.entitys.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.school.managemnt.entitys.models.ClassDtls;

@Repository
@Transactional
public class ClassDtlsDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(ClassDtls classDtls) {
		getSession().save(classDtls);
		return;
	}

	public void delete(ClassDtls classDtls) {
		getSession().delete(classDtls);
		return;
	}

	public void update(ClassDtls classDtls) {
		getSession().update(classDtls);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<ClassDtls> getAll() {
		return getSession().createQuery("from ClassDtls").list();

	}

	/*
	 * public ClassDtls getByClassID(long classID) { return (ClassDtls)
	 * getSession().createQuery("from ClassDtls where classID = :classID")
	 * .setParameter("classID", classID).uniqueResult(); }
	 */

}
