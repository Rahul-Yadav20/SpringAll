package com.BeanScope.Singleton;

/*import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
*/

// There are five bean scope :- singleton, prototype, request, session, globalsession
// request and session are the part of web project and related https reuqest
// globalsession is for portrait applications


// @Component("obj")
// @Scope("prototype")	// This will tell to IOC Container that please create multiple object for class house
					// You can use scope as annotation or use xml for scope 
public class House {
	// @Value("7028")  
	private int hNumber;

	public int gethNumber() {
		return hNumber;
	}

	public void sethNumber(int hNumber) {
		this.hNumber = hNumber;
	}

	@Override
	public String toString() {
		return "House [hNumber=" + hNumber + "]";
	}
	

}
