//package com.example.demo.security;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Service
//public class UserService {
//    private final UserRepo userRepo;
//
//    public UserService(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }
//    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);
//    public Users users(Users users){
//        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
//        return userRepo.save(users);
//    }
//}
