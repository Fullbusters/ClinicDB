package com.clinic.controllers;



import com.clinic.models.Doctor;
import com.clinic.models.Patient;
import com.clinic.models.Role;
import com.clinic.models.User;
import com.clinic.service.DoctorService;
import com.clinic.service.PatientService;
import com.clinic.service.RoleService;
import com.clinic.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AuthController {

    String jwtToken;

    @Autowired
    private UserService userService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private DoctorService doctorService;

    @CrossOrigin
    @RequestMapping(value = "/register/{id}", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody String registerUser(@RequestBody User user, @PathVariable long id) throws ServletException {
        Patient patient = patientService.findOne(id);
        Role role=roleService.findOne(Long.valueOf(2));
        String nick= user.getNickname();

        if (nick==null){
            throw new ServletException("Invalid nick.");
        }

        if (user.getPassword()==null){
            throw new ServletException("Invalid pass.");
        }
        user.setPatient(patient);
        user.setRole(role);
        jwtToken = Jwts.builder().setSubject(nick).setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretKey").compact();
        User savedUser = userService.save(user);


        return  "{ \"token\" : \""+jwtToken+"\", \"id\" : "+savedUser.getUserId()+" , \"role\" : \""+role.getRole()+"\"}";

    }

    @CrossOrigin
    @RequestMapping(value = "/register/patient", method = RequestMethod.POST)
    public Long registerPatient(@RequestBody Patient patient){
        Patient patient1 = patientService.save(patient);
        Patient patientForReturn = patientService.findOne(patient1.getPatientId());
        return patientForReturn.getPatientId();

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

        jwtToken = Jwts.builder().setSubject(nick).setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretKey").compact();
        Role role = checkUser.getRole();
        return "{ \"token\" : \""+jwtToken+"\"  , \"id\" : "+checkUser.getUserId()+" , \"role\" : \""+role.getRole()+"\"}";
    }

    @CrossOrigin
    @RequestMapping(value = "/register/doctor/{id}", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody String registerUserDoctor(@RequestBody User user, @PathVariable long id) throws ServletException {
        Doctor doctor = doctorService.findOne(id);
        Role role=roleService.findOne(Long.valueOf(3));
        String nick= user.getNickname();

        if (nick==null){
            throw new ServletException("Invalid nick.");
        }

        if (user.getPassword()==null){
            throw new ServletException("Invalid pass.");
        }
        user.setDoctor(doctor);
        user.setRole(role);
        jwtToken = Jwts.builder().setSubject(nick).setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretKey").compact();
        User savedUser = userService.save(user);


        return  "{ \"token\" : \""+jwtToken+"\", \"id\" : "+savedUser.getUserId()+" , \"role\" : \""+role.getRole()+"\"}";

    }

    @CrossOrigin
    @RequestMapping(value = "/register/doctor", method = RequestMethod.POST)
    public Long registerDoctor(@RequestBody Doctor doctor){
        Doctor doctor1 = doctorService.save(doctor);
        Doctor doctorForReturn = doctorService.findOne(doctor1.getDoctorId());
        return doctorForReturn.getDoctorId();

    }

}
