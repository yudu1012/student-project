package com.example.demo.schoolProfile;

import com.example.demo.schools.School;
import org.springframework.stereotype.Service;

@Service
public class schoolProfileMapper {

    public schoolProfile toSchoolProfileTo(schoolProfileRecord schoolProfileRecord){
        schoolProfile schoolProfile = new schoolProfile();
        schoolProfile.setEmail(schoolProfileRecord.email());
        schoolProfile.setPhoneNumber(schoolProfileRecord.phoneNumber());
        schoolProfile.setAddress(schoolProfileRecord.address());
        School school = new School();
        school.setId(schoolProfileRecord.school_id());
        schoolProfile.setSchool(school);
        return schoolProfile;
    }
    public schoolProfileReco toSchoolProfileToGet(schoolProfile schoolProfile){
        return new schoolProfileReco(schoolProfile.getEmail(),schoolProfile.getPhoneNumber(),schoolProfile.getAddress());
    }
}
