package com.example.demo.hospitals;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HospitalService {

    private final HospitalRepo hospitalRepo;
    private final HospitalMapper hospitalMapper;

    public HospitalService(HospitalRepo hospitalRepo, HospitalMapper hospitalMapper) {
        this.hospitalRepo = hospitalRepo;
        this.hospitalMapper = hospitalMapper;
    }
    public List<HospitalReco> getAllHospital(){
        return hospitalRepo.findAll().stream().map(hospitalMapper::toHospitalGet).collect(Collectors.toList());
    }
    public HospitalReco getHospitalByID(int id){
        return hospitalRepo.findById(id).stream().map(hospitalMapper::toHospitalGet).findAny().orElse(null);
    }
    public HospitalReco addHospital(HospitalReco hospitalReco){
        var hospital = hospitalMapper.toHospital(hospitalReco);
        var saveHospital = hospitalRepo.save(hospital);
        return hospitalMapper.toHospitalGet(saveHospital);
    }
    public void deleteHospitalByID(int id){
        hospitalRepo.deleteById(id);
    }
}
