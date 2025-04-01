package com.capgemini.poc.sendingAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact_details")
public class Contacts {

    @Id
    private Long phone;

    private String name;
    private String email;
    private String department;

    public Contacts(String name, String email, String department, Long phone) {
        super();
        this.name = name;
        this.email = email;
        this.department = department;
        this.phone = phone;
    }

    public Contacts() {
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "phone=" + phone +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
/*
1. name2. email
3. phone
4. department
*/