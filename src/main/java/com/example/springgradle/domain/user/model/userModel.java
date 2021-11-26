package com.example.springgradle.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class userModel {
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
