package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.omg.CORBA.UserException;
import org.springframework.stereotype.Repository;

import com.lti.beans.User;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public String addUser(User user) throws UserException {
		
		em.persist(user);
		return user.getName();
		
	}

	@Override
	@Transactional
	public User getUser(String email) throws UserException{
		Query qry=em.createQuery("select u from User u where u.email=:pemail");
		qry.setParameter("pemail",email);
		User user=(User) qry.getSingleResult();
		System.out.println(user);
		return user;
	}
	
	@Override
	@Transactional
	public User updateUser(User user)
	{	
		
		em.merge(user);
		return user; 
	}

	@Override
	@Transactional
	public String deleteUser(int id) {
		User user=em.find(User.class, id);
		em.remove(user);
		return ("User deleted");
	}

}