package com.github.brianmmcclain.k8smicroservicedemocustomize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CustomController {
    
    @Autowired
    private Customization c;

    @GetMapping("/")
    public String fullCustomizations() {
        return "foreground: " + c.getFGColor() + "\n" +
               "background: " + c.getBGColor() + "\n";
    }
}