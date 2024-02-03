package com.dao;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.Contact;

@Repository
public class FormDao {
	
	@Autowired
	private HibernateTemplate hiber;
	
	@Transactional
	public int saveUser(Contact con) {
		
		int save = (Integer) this.hiber.save(con);
		return save;
	}
	public HibernateTemplate getHiber() {
		return hiber;
	}
	public void setHiber(HibernateTemplate hiber) {
		this.hiber = hiber;
	}
}
