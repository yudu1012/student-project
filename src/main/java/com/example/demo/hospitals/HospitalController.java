package com.example.demo.hospitals;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HospitalController {

    private final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }
    @GetMapping("/getAllHospitals")
    public List<HospitalReco> getAllHospitals(){
        return hospitalService.getAllHospital();
    }
    @GetMapping("/getHospitalBYID/{id}")
    public HospitalReco getHospitalByID(@PathVariable("id") int id){
        return hospitalService.getHospitalByID(id);
    }
    @PostMapping("/addHospital")
    public HospitalReco addHospital(@RequestBody HospitalReco hospitalReco){
        return hospitalService.addHospital(hospitalReco);
    }
    @DeleteMapping("/deleteHopitalBYID/{id}")
    public void deleteHospitalByID(@PathVariable("id")int id){
        hospitalService.deleteHospitalByID(id);
    }
}
