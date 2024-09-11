package com.affa.SpringSecurityBasic.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class NewUserRequest {
    private String name;
    private String password;
}
