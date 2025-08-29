package com.example.studentProfile;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentProfileService {

    private final StudentProfileMapper studentProfileMapper;
    private final StudentProfileRepo studentProfileRepo;

    public StudentProfileService(StudentProfileMapper studentProfileMapper, StudentProfileRepo studentProfileRepo) {
        this.studentProfileMapper = studentProfileMapper;
        this.studentProfileRepo = studentProfileRepo;
    }
    public List<StudentProfileReco> getAllStudentProfiles(){
        return studentProfileRepo.findAll().stream().map(studentProfileMapper::toStudentProfileGet).collect(Collectors.toList());
    }
    public StudentProfileReco getStudentProfileByID(int id){
        return studentProfileRepo.findById(id).stream().map(studentProfileMapper::toStudentProfileGet).findAny().orElse(null);
    }
    public StudentProfileReco addStudentProfile(StudentProfileRecord studentProfileRecord){
        StudentProfile studentProfile = studentProfileMapper.toStudentProfile(studentProfileRecord);
        StudentProfile saveStudentProfile = studentProfileRepo.save(studentProfile);
        return studentProfileMapper.toStudentProfileGet(saveStudentProfile);
    }
    public void deleteStudentProfileById(int id){
        studentProfileRepo.deleteById(id);
    }


}
