package com.example.demo.hospitals;

import org.springframework.stereotype.Service;

@Service
public class HospitalMapper {

    public Hospital toHospital(HospitalReco hospitalReco){
        Hospital hospital = new Hospital();
        hospital.setCity(hospitalReco.city());
        hospital.setAddress(hospitalReco.address());
        hospital.setName(hospitalReco.name());
        hospital.setEmail(hospitalReco.email());
        hospital.setCity(hospitalReco.city());
        hospital.setPhone(hospitalReco.phone());
        hospital.setPostalCode(hospitalReco.postalCode());
        hospital.setRegion(hospitalReco.region());
        hospital.setWebsite(hospitalReco.website());
        return hospital;
    }
    public HospitalReco toHospitalGet(Hospital hospital){
        return new HospitalReco(hospital.getName(),hospital.getAddress(),hospital.getCity(),hospital.getRegion(),hospital.getPostalCode(),hospital.getPhone(),hospital.getEmail(),hospital.getWebsite());
    }
}
