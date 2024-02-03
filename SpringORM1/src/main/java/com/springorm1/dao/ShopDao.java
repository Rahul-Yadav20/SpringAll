package com.springorm1.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;


import com.springorm1.entities.ShopKeeper;

public class ShopDao {
	
	private HibernateTemplate hiber;
	@Transactional
	public int insert(ShopKeeper keeper)
		{	
			Integer i = (Integer) this.hiber.save(keeper);
			return i;
		}
	public HibernateTemplate getHiber() {
		return hiber;
	}
	public void setHiber(HibernateTemplate hiber) {
		this.hiber = hiber;
	}
	
}

