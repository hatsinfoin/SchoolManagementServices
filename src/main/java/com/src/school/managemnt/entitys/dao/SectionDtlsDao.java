package com.src.school.managemnt.entitys.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.school.managemnt.entitys.models.SectionDtls;

@Repository
@Transactional
public class SectionDtlsDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(SectionDtls sectionDtls) {
		getSession().save(sectionDtls);
		return;
	}

	public void delete(SectionDtls sectionDtls) {
		getSession().delete(sectionDtls);
		return;
	}

	public void update(SectionDtls sectionDtls) {
		getSession().update(sectionDtls);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<SectionDtls> getAll() {
		return getSession().createQuery("from SectionDtls").list();

	}

	/*public SectionDtls getBySectionID(long sectionID) {
		return (SectionDtls) getSession().createQuery("from SectionDtls where sectionID = :sectionID")
				.setParameter("sectionID", sectionID).uniqueResult();
	}*/

}
