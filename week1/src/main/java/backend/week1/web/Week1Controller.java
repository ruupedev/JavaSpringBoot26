package backend.week1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ResponseBody
public class Week1Controller {
    @GetMapping("/index")
    public String getIndex() {
        return "This is the main page";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "This is the contact page";
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, defaultValue = "Moon") String location, String name) {
        return "Welcome to the " + location + " " + name;
    }

}
