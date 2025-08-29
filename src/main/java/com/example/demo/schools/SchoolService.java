package com.example.demo.schools;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {

    private final SchoolRepo schoolRepo;
    private final SchoolMapper schoolMapper;

    public SchoolService(SchoolRepo schoolRepo, SchoolMapper schoolMapper) {
        this.schoolRepo = schoolRepo;
        this.schoolMapper = schoolMapper;
    }
    public List<SchoolReco> getAllSchools(){
        return schoolRepo.findAll().stream().map(schoolMapper::toSchoolGet).collect(Collectors.toList());
    }
    public SchoolReco getSchoolByID(int id){
        return schoolRepo.findById(id).stream().map(schoolMapper::toSchoolGet).findAny().orElse(null);
    }
    public SchoolReco addSchool(SchoolReco schoolReco){
        School school = schoolMapper.toSchool(schoolReco);
        School saveSchool = schoolRepo.save(school);
        return schoolMapper.toSchoolGet(saveSchool);
    }
    public void deleteSchoolByID(int id){
        schoolRepo.deleteById(id);
    }
}
