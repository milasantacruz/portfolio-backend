/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring02.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class CorsConfig {
    
    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer(){
            @Override
            
            public void addCorsMappings(CorsRegistry registry){
                /*registry.addMapping("/login")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("*")
                        .exposedHeaders("*");
                registry.addMapping("/usuario/buscar/1")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("*");
                registry.addMapping("/proyecto/**")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("*");
                registry.addMapping("/proyecto/1/proyecto/**")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("*");
                registry.addMapping("/cliente/**")
                        .allowedOrigins("http://localhost:4200")
                        .allowedMethods("*");*/
                
                registry.addMapping("/login")
                        .allowedOrigins("https://portfolio-angular-b14ce.web.app")
                        .allowedMethods("*")
                        .exposedHeaders("*");
                registry.addMapping("/usuario/buscar/1")
                        .allowedOrigins("https://portfolio-angular-b14ce.web.app")
                        .allowedMethods("*");
                registry.addMapping("/proyecto/**")
                        .allowedOrigins("https://portfolio-angular-b14ce.web.app")
                        .allowedMethods("*");
                registry.addMapping("/proyecto/1/proyecto/**")
                        .allowedOrigins("https://portfolio-angular-b14ce.web.app")
                        .allowedMethods("*");
                registry.addMapping("/cliente/**")
                        .allowedOrigins("https://portfolio-angular-b14ce.web.app")
                        .allowedMethods("*");
            }
        };
    }
}
