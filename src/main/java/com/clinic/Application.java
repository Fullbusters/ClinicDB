package com.clinic;


import com.clinic.config.JWTFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JWTFilter());
        registrationBean.addUrlPatterns("/api/secure/*");

        return registrationBean;
    }
    public static void main(String[] args) {

        SpringApplication.run(com.clinic.Application.class, args);
    }

}