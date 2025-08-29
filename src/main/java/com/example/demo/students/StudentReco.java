package com.example.demo.students;

public record StudentReco(
        int id,
        String first_name,
        String last_name,
        String middle_name,
        String birth_date,
        String gender
) {
}
