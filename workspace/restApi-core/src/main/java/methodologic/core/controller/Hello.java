package methodologic.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import methodologic.core.Interface.HelloInterface;

@RestController
@RequestMapping("/")
public class Hello implements HelloInterface{
	
	@GetMapping("/hello")
    public String HelloPage() {
        return "Hello, welcome!";
    }

}
