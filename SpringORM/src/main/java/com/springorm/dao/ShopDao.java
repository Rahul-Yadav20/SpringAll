package com.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;


import com.springorm.entities.ShopKeeper;

public class ShopDao {
	
	private HibernateTemplate hiber;
	@Transactional
	public int insert(ShopKeeper keeper)
		{	
			Integer i = (Integer) this.hiber.save(keeper);
			return i;
		}
	
	public ShopKeeper getShop(int sNo)
	{
		ShopKeeper shopKeeper = hiber.get(ShopKeeper.class, sNo);
		return shopKeeper;
	}
	
	public List<ShopKeeper> getAllShop()
	{
		List<ShopKeeper> shopKeeper = hiber.loadAll(ShopKeeper.class);
		return shopKeeper;
	}
	
	@Transactional
	public void deleteShop(int sNo) {
		ShopKeeper shop = hiber.get(ShopKeeper.class, sNo);
		hiber.delete(shop);
	}
	
	@Transactional
	public void updateShop(ShopKeeper shop) {
		hiber.update(shop);
	}
	
	public HibernateTemplate getHiber() {
		return hiber;
	}
	public void setHiber(HibernateTemplate hiber) {
		this.hiber = hiber;
	}
	
}

