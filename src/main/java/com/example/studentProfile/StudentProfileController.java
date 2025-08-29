package com.example.studentProfile;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentProfileController {

    private final StudentProfileService studentProfileService;

    public StudentProfileController(StudentProfileService studentProfileService) {
        this.studentProfileService = studentProfileService;
    }
    @GetMapping("/getAllStudentProfile")
    public List<StudentProfileReco> getAllStudentProfile(){
        return studentProfileService.getAllStudentProfiles();
    }
    @GetMapping("/getStudentProfileByID/{id}")
    public StudentProfileReco getStudentProfileByID(@PathVariable("id") int id){
        return studentProfileService.getStudentProfileByID(id);
    }
    @PostMapping("/addStudentProfile")
    public StudentProfileReco addStudentProfile(@RequestBody StudentProfileRecord studentProfileReco){
        return studentProfileService.addStudentProfile(studentProfileReco);
    }
    @DeleteMapping("/deleteStudentProfile/{id}")
    public void deleteStudentProfileById(@PathVariable("id") int id){
        studentProfileService.deleteStudentProfileById(id);
    }
}
