package org.nazarovpro.monolithic.main.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController extends DefaultController {

    @GetMapping
    public String helloWorld(){
        return "Hello, Monolithic Application !";
    }

}
