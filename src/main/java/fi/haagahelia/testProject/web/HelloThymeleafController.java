package fi.haagahelia.testProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloThymeleafController {

	@Controller
	public class HelloController {
	    @RequestMapping("/hellothymeleaf")
	    
	    public String SayHello
	    
	    	(@RequestParam(name = "name", defaultValue = "World") String name,
	    	@RequestParam(name = "age", defaultValue = "0") int age,
	    	Model model) {
	        model.addAttribute("name", name);
	        model.addAttribute("age", age);
	     

	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        
	    return "helloThymeleaf";
	    }
	}
}
