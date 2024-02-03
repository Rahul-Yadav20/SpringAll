package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	/*Using REDIRECT PREFIX
	 * 
	 * @RequestMapping("/one") 
	 * public String one() 
	 * {
	 * System.out.println("This is one page"); 
	 * return "redirect:/form"; 
	 * }
	 */
	
	//Using RedirectView class
	 @RequestMapping("/one") 
	  public RedirectView one() 
	  {
		 System.out.println("This is one page"); 
		 RedirectView redirect = new RedirectView();
		 redirect.setUrl("https://www.amazon.com");
		 return redirect; 
	  }
	
	@RequestMapping("/two")
	public String two()
	{	System.out.println("This is second page");
		return "form"; 
	}
}
