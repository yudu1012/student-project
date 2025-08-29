package com.example.demo.studentProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentProfileRepo extends JpaRepository<StudentProfile,Integer> {
}
