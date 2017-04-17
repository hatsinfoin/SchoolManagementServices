package com.src.school.managemnt.entitys.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.school.managemnt.entitys.models.TeacherDtls;

@Repository
@Transactional
public class TeacherDtlsDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(TeacherDtls teacherDtls) {
		getSession().save(teacherDtls);
		return;
	}

	public void delete(TeacherDtls teacherDtls) {
		getSession().delete(teacherDtls);
		return;
	}

	public void update(TeacherDtls teacherDtls) {
		getSession().update(teacherDtls);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<TeacherDtls> getAll() {
		return getSession().createQuery("from TeacherDtls").list();

	}

	/*public TeacherDtls getBySectionID(long teacherId) {
		return (TeacherDtls) getSession().createQuery("from TeacherDtls where teacherId = :teacherId")
				.setParameter("teacherId", teacherId).uniqueResult();
	}
*/

}
