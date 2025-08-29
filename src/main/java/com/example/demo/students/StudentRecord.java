package com.example.demo.students;

public record StudentRecord(
        int id,
        String first_name,
        String last_name,
        String middle_name,
        String birth_date,
        String gender,
        int school_id
) {
}
