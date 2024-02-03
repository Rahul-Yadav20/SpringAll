package com.mockito.business;
import java.util.ArrayList;
import java.util.List;

import com.mockito.data.api.TodoService;

//System Under Test(SUT) - TodoBusinessImpl
// TodoService - Dependency
public class TodoBusinessImpl {
	private TodoService doService;
	
	public TodoBusinessImpl(TodoService doService) {
		this.doService = doService; 
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = doService.retrieveTodos(user);
		
		for(String todo: todos) {
			if(todo.contains("Spring")){
				filteredTodos.add(todo);
			}
		}
		
		return filteredTodos;
	}
}	
