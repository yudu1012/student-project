package com.example.demo.schools;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School,Integer> {
}
