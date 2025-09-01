package com.example.demo.hospitals;

import com.example.demo.students.Student;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Hospital {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int address;
    String city;
    int region;
    int postalCode;
    int phone;
    String email;
    String  website;
    @OneToMany
    private List<Student> students;

    public Hospital() {
    }

    public Hospital(String name, int address, String city, int region, int postalCode, int phone, String email, String website) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
        this.website = website;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", city='" + city + '\'' +
                ", region=" + region +
                ", postalCode=" + postalCode +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
