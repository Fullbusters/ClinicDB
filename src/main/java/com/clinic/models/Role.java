package com.clinic.models;

import javax.persistence.*;

@Entity
@Table(name="User")
public class Role {

    @Id
    @GeneratedValue
    @Column(name="Role_id")
    private Long roleId;
    @Column(name="Role")
    private String role;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
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
}
