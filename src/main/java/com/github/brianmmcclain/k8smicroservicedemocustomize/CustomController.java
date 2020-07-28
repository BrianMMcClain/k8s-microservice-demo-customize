package com.github.brianmmcclain.k8smicroservicedemocustomize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {
    
    @Autowired
    private Customization c;

    @GetMapping("/")
    public String fullCustomizations() {
        System.out.println(c.toJSON());
        return c.toJSON();
    }
}