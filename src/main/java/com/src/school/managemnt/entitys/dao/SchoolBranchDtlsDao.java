package com.src.school.managemnt.entitys.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.src.school.managemnt.entitys.models.SchoolBranchDtls;

@Repository
@Transactional
public class SchoolBranchDtlsDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(SchoolBranchDtls schoolBranchDtls) {
		getSession().save(schoolBranchDtls);
		return;
	}

	public void delete(SchoolBranchDtls schoolBranchDtls) {
		getSession().delete(schoolBranchDtls);
		return;
	}

	public void update(SchoolBranchDtls schoolBranchDtls) {
		getSession().update(schoolBranchDtls);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<SchoolBranchDtls> getAll() {
		return getSession().createQuery("from SchoolBranchDtls").list();

	}

	/*
	 * public SchoolBranchDtls getByschoolBranchId(long schoolBranchId) { return
	 * (SchoolBranchDtls) getSession() .createQuery(
	 * "from SchoolBranchDtls where schoolBranchId = :schoolBranchId")
	 * .setParameter("schoolBranchId", schoolBranchId).uniqueResult(); }
	 */
}
