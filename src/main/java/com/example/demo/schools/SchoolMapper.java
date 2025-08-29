package com.example.demo.schools;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {

    public School toSchool(SchoolReco schoolReco){
        School school = new School();
        school.setName(schoolReco.name());
        school.setAddress(schoolReco.address());
        school.setPhone(schoolReco.phone());
        school.setEmail(schoolReco.email());
        school.setWebsite(schoolReco.website());
        school.setType(schoolReco.type());
        school.setDescription(schoolReco.description());
        return school;
    }
    public SchoolReco toSchoolGet(School school){
        return new SchoolReco(school.getName(),school.getAddress(),school.getPhone(),school.getEmail(),school.getWebsite(),school.getType(),school.getDescription());
    }
}
