//package com.example.demo.security;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyUserDetailService implements UserDetailsService {
//    private final UserRepo userRepo;
//
//    public MyUserDetailService(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Users users =userRepo.findByUsername(username);
//        if (users == null){
//            throw new RuntimeException("not found");
//        }
//        return new com.example.demo.security.UserDetails(users);
//    }
//}
