package com.clinic.controllers;



import com.clinic.models.User;
import com.clinic.service.UserService;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;


@RestController
@RequestMapping("/api")
public class UserController {

    String jwtToken;

    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody String registerUser(@RequestBody User user) throws ServletException {
        String nick= user.getNickname();

        if (nick==null){
            throw new ServletException("Invalid nick.");
        }

        if (user.getPassword()==null){
            throw new ServletException("Invalid pass.");
        }

        jwtToken = Jwts.builder().setSubject(nick).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretKey").compact();
        userService.save(user);

        return  "{ \"token\" : \""+jwtToken+"\"}";

    }

    @CrossOrigin
    @RequestMapping(path = "/login" ,method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody String login(@RequestBody User user) throws ServletException {



        String nick= user.getNickname();

        final User checkUser=userService.findByNickname(user.getNickname());

        if (checkUser==null){
            throw new ServletException("Invalid nick. Please check your name and password.");
       }

        if (!checkUser.getPassword().equals(user.getPassword())){
            throw new ServletException("Invalid pass. Please check your name and password.");
        }

        jwtToken = Jwts.builder().setSubject(nick).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretKey").compact();

        return "{ \"token\" : \""+jwtToken+"\"}";
    }
}
