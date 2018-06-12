package com.clinic.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Role")
public class Role {

    @Id
    @GeneratedValue
    @Column(name="Role_id")
    private Long roleId;
    @Column(name="Role")
    private String role;
    @OneToMany( mappedBy = "role")
    private List<User> users;

    public Role() {
    }

    public Role(String role, List<User> users) {
        this.role = role;
        this.users = users;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
