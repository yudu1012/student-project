package com.example.studentProfile;

import com.example.demo.students.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentProfileMapper {

    public StudentProfile toStudentProfile(StudentProfileRecord studentProfileRecord){
        StudentProfile studentProfile = new StudentProfile();
        studentProfile.setEmail(studentProfileRecord.email());
        studentProfile.setPhoneNumber(studentProfileRecord.phoneNumber());
        studentProfile.setAddress(studentProfileRecord.address());
        Student student = new Student();
        student.setId(studentProfileRecord.student_id());
        studentProfile.setStudent(student);
        return studentProfile;
    }
    public StudentProfileReco toStudentProfileGet(StudentProfile studentProfile){
        return new StudentProfileReco(studentProfile.getEmail(),studentProfile.getPhoneNumber(),studentProfile.getAddress());
    }
}
