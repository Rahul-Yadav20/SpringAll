package com.springorm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springorm.entities.ShopKeeper;

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

