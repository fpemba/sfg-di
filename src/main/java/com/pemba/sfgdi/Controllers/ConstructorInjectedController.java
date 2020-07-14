package com.pemba.sfgdi.Controllers;

import com.pemba.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
