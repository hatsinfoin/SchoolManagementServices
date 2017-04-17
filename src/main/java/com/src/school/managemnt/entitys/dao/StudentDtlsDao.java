package com.src.school.managemnt.entitys.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.school.managemnt.entitys.models.StudentDtls;

@Repository
@Transactional
public class StudentDtlsDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(StudentDtls studentDtls) {
		getSession().save(studentDtls);
		return;
	}

	public void delete(StudentDtls studentDtls) {
		getSession().delete(studentDtls);
		return;
	}

	public void update(StudentDtls studentDtls) {
		getSession().update(studentDtls);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<StudentDtls> getAll() {
		return getSession().createQuery("from StudentDtls").list();

	}

	/*public StudentDtls getByStudentKeyID(long studentKeyID) {
		return (StudentDtls) getSession().createQuery("from StudentDtls where studentKeyID = :studentKeyID")
				.setParameter("studentKeyID", studentKeyID).uniqueResult();
	}
*/

}
