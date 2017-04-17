package com.src.school.managemnt.entitys.user.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.school.managemnt.entitys.models.user.User;

 
@Repository
@Transactional
public class UserDtlsDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(User user) {
		getSession().save(user);
		return;
	}

	public void delete(User user) {
		getSession().delete(user);
		return;
	}

	public void update(User user) {
		getSession().update(user);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		return getSession().createQuery("from User").list();

	}

	@SuppressWarnings("unchecked")
	public User getUser(String userName) {
		List<User> userList =  getSession().createQuery("from User where userName = '"+userName+"'").list();
		return (userList.isEmpty() ? null : userList.get(0));

	}
	/*
	 * public ParentDtls getByStudentKeyID(long parentId) { return (ParentDtls)
	 * getSession().createQuery("from ParentDtls where parentId = :parentId")
	 * .setParameter("parentId", parentId).uniqueResult(); }
	 */

}
