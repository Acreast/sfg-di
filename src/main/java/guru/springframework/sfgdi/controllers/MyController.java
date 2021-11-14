package guru.springframework.sfgdi.controllers;


import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //Annotate as spring managed component
public class MyController {

    //Autowired and qualifier not used, using primary bean
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld(){
        return  greetingService.sayGreeting();
    }

}
