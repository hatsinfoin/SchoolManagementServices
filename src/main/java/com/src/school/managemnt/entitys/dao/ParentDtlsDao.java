package com.src.school.managemnt.entitys.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.src.school.managemnt.entitys.models.ParentDtls;

@Repository
@Transactional
public class ParentDtlsDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(ParentDtls parentDtls) {
		getSession().save(parentDtls);
		return;
	}

	public void delete(ParentDtls parentDtls) {
		getSession().delete(parentDtls);
		return;
	}

	public void update(ParentDtls parentDtls) {
		getSession().update(parentDtls);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<ParentDtls> getAll() {
		return getSession().createQuery("from ParentDtls").list();

	}

	/*
	 * public ParentDtls getByStudentKeyID(long parentId) { return (ParentDtls)
	 * getSession().createQuery("from ParentDtls where parentId = :parentId")
	 * .setParameter("parentId", parentId).uniqueResult(); }
	 */

}
