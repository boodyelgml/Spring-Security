package com.affa.SpringSecurityBasic.controller;

import com.affa.SpringSecurityBasic.user.NewUserRequest;
import com.affa.SpringSecurityBasic.user.User;
import com.affa.SpringSecurityBasic.user.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class welcome {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping
    public String welcome(){
        return "hello mother fuck er";
    }

    @PostMapping("newUser")
    public void newUser(@RequestBody NewUserRequest request){
        var user = new User();
        user.setName(request.getName());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        this.userRepository.saveAndFlush(user);
    }
}
