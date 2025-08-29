package com.example.demo.studentProfile;

import com.example.demo.students.Student;
import jakarta.persistence.*;

@Entity
public class StudentProfile {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String email;
    int phoneNumber;
    String address;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
    public StudentProfile() {
    }

    public StudentProfile(String email, int phoneNumber, String address) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentProfile{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
