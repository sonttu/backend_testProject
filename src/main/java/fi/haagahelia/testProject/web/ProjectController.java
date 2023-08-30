package fi.haagahelia.testProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@Controller
public class ProjectController {

    @RequestMapping("/index")
    @ResponseBody
    public String showMainPage() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String showContactPage() {
        return "This is the contact page";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(
            @RequestParam(name = "location", required = true) String location,
            @RequestParam(name = "name", required = true) String name) {
        return "Welcome to the " + location + " " + name + "!";
    }
}







}