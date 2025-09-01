package com.example.demo.hospitals;

public record HospitalReco(
        String name,
        int address,
        String city,
        int region,
        int postalCode,
        int phone,
        String email,
        String  website
) {
}
