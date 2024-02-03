package com.TodoDao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import com.entities.Todo;

@Component
public class ToDao {
	@Autowired
	HibernateTemplate hiber;
	
	@Transactional
	public int save(Todo todo) {
			
			Integer i = (Integer) hiber.save(todo);
			return i;	
	}
	
	public List<Todo> getAll()
	{
		List<Todo> todo = hiber.loadAll(Todo.class);
		return todo;
	}
	
	public HibernateTemplate getHiber() {
		return hiber;
	}
	public void setHiber(HibernateTemplate hiber) {
		this.hiber = hiber;
	}
	
	
}
