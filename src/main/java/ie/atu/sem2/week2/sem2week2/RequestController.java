package ie.atu.sem2.week2.sem2week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World...";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name : " + name + ",  Age : " + age;
    }

    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person("Conor", 21);
        return person;
    }
}