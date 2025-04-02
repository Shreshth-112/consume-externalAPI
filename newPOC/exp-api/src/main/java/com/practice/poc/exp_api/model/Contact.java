package com.practice.poc.exp_api.model;

public class Contact {

    private Long phone;
    private String name;
    private String email;
    private String department;

    public Contact() {
    }

    public Contact(Long phone, String department, String email, String name) {
        super();
        this.phone = phone;
        this.department = department;
        this.email = email;
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone=" + phone +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
