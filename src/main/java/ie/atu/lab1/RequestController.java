package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/Hello")
    public String hello(){
        return"Hello,World";
    }
    @GetMapping("/greet/{name}")
    public String greetByName (@PathVariable String name){
        return "User Name: " + name;
    }
    @GetMapping("/details")
    public String details (@RequestParam int age, String name) {
        return "User Name:  \nUser Age: " + name + age;}
}
