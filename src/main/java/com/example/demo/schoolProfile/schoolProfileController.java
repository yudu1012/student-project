package com.example.demo.schoolProfile;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class schoolProfileController {

    private final schoolProfileService schoolProfileService;

    public schoolProfileController(schoolProfileService schoolProfileService) {
        this.schoolProfileService = schoolProfileService;
    }

    @GetMapping("/getAllSchoolProfile")
    public List<schoolProfileReco> getAllSchoolProfile() {
        return schoolProfileService.getAllSchoolProfiles();
    }

    @GetMapping("/getSchoolProfileByID/{id}")
    public schoolProfileReco getSchoolProfileById(@PathVariable("id") int id) {
        return schoolProfileService.getSchoolProfileBYID(id);
    }

    @PostMapping("/addSchoolProfile")
    public schoolProfileReco addSchoolProfile(@RequestBody schoolProfileRecord schoolProfileRecord) {
        return schoolProfileService.addSchoolProfile(schoolProfileRecord);
    }

    @DeleteMapping("/deleteSchoolProfileByID/{id}")
    public void deleteSchoolProfileByID(@PathVariable("id") int id) {
        schoolProfileService.deleteSchoolProfileByID(id);
    }
}
