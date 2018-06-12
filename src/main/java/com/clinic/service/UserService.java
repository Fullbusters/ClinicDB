package com.clinic.service;

import com.clinic.models.User;
import com.clinic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findOne(Long id){
        return userRepository.findOne(id);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User save(User user){
       return userRepository.save(user);
    }
    public void delete(Long id){
        userRepository.delete(id);
    }
    public User findByNickname(String nickname){
        return userRepository.findByNickname(nickname);
    }

}
