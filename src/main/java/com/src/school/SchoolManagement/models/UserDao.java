package com.src.school.SchoolManagement.models;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDao {
  
  @Autowired
  private SessionFactory _sessionFactory;
  
  private Session getSession() {
    return _sessionFactory.getCurrentSession();
  }

  public void save(Users user) {
    getSession().save(user);
    return;
  }
  
  public void delete(Users user) {
    getSession().delete(user);
    return;
  }
  
  @SuppressWarnings("unchecked")
  public List<Users> getAll() {
    return getSession().createQuery("from User").list();
  }
  
  public Users getByEmail(String email) {
    return (Users) getSession().createQuery(
        "from User where email = :email")
        .setParameter("email", email)
        .uniqueResult();
  }

  public Users getById(long id) {
    return (Users) getSession().load(Users.class, id);
  }

  public void update(Users user) {
    getSession().update(user);
    return;
  }

} // class UserDao
