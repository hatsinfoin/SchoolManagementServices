package com.src.school.managemnt.entitys.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.src.school.managemnt.entitys.models.TaskDtls;

@Repository
@Transactional
public class TaskDtlsDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(TaskDtls taskDtls) {
		getSession().save(taskDtls);
		return;
	}

	public void delete(TaskDtls taskDtls) {
		getSession().delete(taskDtls);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<TaskDtls> getByTaskdate(String taskDate) {
		return getSession().createQuery("from TaskDtls  WHERE taskDate="+taskDate).list();

	}
	@SuppressWarnings("unchecked")
	public List<TaskDtls> getAll() {
		return getSession().createQuery("from TaskDtls").list();

	}
}
