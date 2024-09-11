package com.affa.SpringSecurityBasic.basicSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class BasicSecurityConfig {

    /*
     * here we configure username and password as props in application.properties
     * spring.security.user.name=user
     * spring.security.user.password=123456
     * */

//    @Bean
//    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeHttpRequests(auth -> {
//                    auth
//                            .requestMatchers("/permittedLink").permitAll()
//                            .anyRequest().authenticated();
//                })
//                .formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults())
//                .build();
//    }

}
