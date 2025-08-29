package com.example.demo.schools;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @GetMapping("/getAllSchools")
    public List<SchoolReco> getAllSchools(){
        return schoolService.getAllSchools();
    }
    @GetMapping("/getSchoolByID/{id}")
    public SchoolReco getSchoolByID(@PathVariable("id") int id){
        return schoolService.getSchoolByID(id);
    }
    @PostMapping("/addSchool")
    public SchoolReco addSchool(@RequestBody SchoolReco schoolReco){
        return schoolService.addSchool(schoolReco);
    }
    @DeleteMapping("/deleteSChoolByID/{id}")
    public void deleteSchoolById(@PathVariable("id") int id){
        schoolService.deleteSchoolByID(id);
    }
}
