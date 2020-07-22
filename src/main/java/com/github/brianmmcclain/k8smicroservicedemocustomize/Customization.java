package com.github.brianmmcclain.k8smicroservicedemocustomize;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")
public class Customization {
    
    private String bgcolor;
    private String fgcolor;

    public String getFGColor() {
        return this.fgcolor;
    }

    public void setFGColor(String color) {
        this.fgcolor = color;
    }

    public String getBGColor() {
        return this.bgcolor;
    }

    public void setBGColor(String color) {
        this.bgcolor = color;
    }

    public String toJSON() {
        Map<String,String> payload = new HashMap<>();
        payload.put("fgcolor", this.fgcolor);
        payload.put("bgcolor", this.bgcolor);

        try {
			return new ObjectMapper().writeValueAsString(payload);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
            e.printStackTrace();
            return "";
		}
    }
}