package com.src.school.managemnt.entitys.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.school.managemnt.entitys.models.AttendenceDtls;

@Repository
@Transactional
public class AttendenceDtlsDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(AttendenceDtls attendenceDtls) {
		getSession().save(attendenceDtls);
		return;
	}

	public void delete(AttendenceDtls attendenceDtls) {
		getSession().delete(attendenceDtls);
		return;
	}

	public void update(AttendenceDtls attendenceDtls) {
		getSession().update(attendenceDtls);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<AttendenceDtls> getAll() {
		return getSession().createQuery("from AttendenceDtls").list();

	}

	/*public AttendenceDtls getByStudentKeyID(long studentKeyID) {
		return (AttendenceDtls) getSession().createQuery("from AttendenceDtls where studentKeyID = :studentKeyID")
				.setParameter("studentKeyID", studentKeyID).uniqueResult();
	}*/


}
