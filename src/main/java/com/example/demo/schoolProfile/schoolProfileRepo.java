package com.example.demo.schoolProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface schoolProfileRepo extends JpaRepository<schoolProfile,Integer> {
}
