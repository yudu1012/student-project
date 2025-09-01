package com.example.demo.schoolProfile;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class schoolProfileService {

    private final schoolProfileMapper schoolProfileMapper;
    private final schoolProfileRepo schoolProfileRepo;

    public schoolProfileService(schoolProfileMapper schoolProfileMapper, schoolProfileRepo schoolProfileRepo) {
        this.schoolProfileMapper = schoolProfileMapper;
        this.schoolProfileRepo = schoolProfileRepo;
    }
    public List<schoolProfileReco> getAllSchoolProfiles(){
        return schoolProfileRepo.findAll().stream().map(schoolProfileMapper::toSchoolProfileToGet).collect(Collectors.toList());
    }
    public schoolProfileReco getSchoolProfileBYID(int id){
        return schoolProfileRepo.findById(id).stream().map(schoolProfileMapper::toSchoolProfileToGet).findAny().orElse(null);
    }
    public schoolProfileReco addSchoolProfile(schoolProfileRecord schoolProfileRecord){
        schoolProfile schoolProfile = schoolProfileMapper.toSchoolProfileTo(schoolProfileRecord);
        schoolProfile saveSchoolProfile = schoolProfileRepo.save(schoolProfile);
        return schoolProfileMapper.toSchoolProfileToGet(saveSchoolProfile);
    }
    public void deleteSchoolProfileByID(int id){
        schoolProfileRepo.deleteById(id);
    }
}
