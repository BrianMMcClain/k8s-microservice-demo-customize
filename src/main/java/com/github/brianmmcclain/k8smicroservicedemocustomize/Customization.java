package com.github.brianmmcclain.k8smicroservicedemocustomize;

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
}