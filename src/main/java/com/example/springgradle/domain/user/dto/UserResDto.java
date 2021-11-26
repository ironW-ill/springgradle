package com.example.springgradle.domain.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResDto {
    private String id;
    private String password;
    private String name;
    private int phone;
    private String email;
    private String useYN;
    private String access_token;
    private String refresh_token;
    private String expires_in;
    private String registDate;
    private String updateDate;
}
