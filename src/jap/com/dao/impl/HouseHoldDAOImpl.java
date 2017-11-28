package jap.com.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import jap.com.dao.HouseHoldDao;
import jap.com.model.c_t_house_hold;

@Component("u") 
public class HouseHoldDAOImpl implements HouseHoldDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(c_t_house_hold user) {
		System.out.println("session factory class:" + sessionFactory.getClass());
		
	    Session s = sessionFactory.getCurrentSession();
		s.save(user);
		
		System.out.println("user saved!");
	}
}
