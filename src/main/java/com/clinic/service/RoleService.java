package com.clinic.service;

import com.clinic.models.Role;
import com.clinic.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role findOne(Long id){
        return roleRepository.findOne(id);
    }
    public List<Role> findAll(){
        return roleRepository.findAll();
    }
    public void save(Role role){
        roleRepository.save(role);
    }
    public void delete(Long id){
        roleRepository.delete(id);
    }
}
