package com.mvc;

import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pojo.Contact;
import com.service.userService;

@Controller
public class Registration {
	
	
	/*
	 * @Autowired 
	 * ServletContext context;
	 */
	
	@Autowired
	private userService ser;
	
	
	
	
	@RequestMapping("/form")
	public String form(Model m) {
		String str="form";
		m.addAttribute("page", str);
		return "form";
	}

	
	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("contact") Contact contact, Model model) {
		
		contact.setDate(new Date());
		ser.createUser(contact);
		model.addAttribute("msg", "User Registered Successfully.....");
		return "submit";
	}
	
	
	/*
	@RequestMapping(path = "/submitForm", method = RequestMethod.POST)
	public String processForm(@RequestParam("mail") String mail, @RequestParam("name") String name,
			@RequestParam("password") String pass, Model m, Contact con) {
		
		con.setMail(mail);
		con.setName(name);
		con.setPass(pass);
		
		m.addAttribute("contact", con);
		
		
		return "submit";
	}
	*/
}
