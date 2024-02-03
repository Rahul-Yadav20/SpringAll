package com.mockito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring", "Learn Spring MVC", "Learn to Dance");
	}

}
