package com.github.brianmmcclain.k8smicroservicedemocustomize;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {
    
    @Autowired
    private Customization c;

    @Autowired
    Environment env;

    @GetMapping("/")
    public String fullCustomizations() {
        System.out.println(c.toJSON());
        return c.toJSON();
    }

    @GetMapping("/info")
    public String getConfig() {
        Map<String,String> payload = new HashMap<>();
        String profiles = "[" + String.join(", ", this.env.getActiveProfiles()) + "]";
        
        payload.put("profiles", profiles);
        
        try {
			return new ObjectMapper().writeValueAsString(payload);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
            e.printStackTrace();
            return "";
		}
    }
}