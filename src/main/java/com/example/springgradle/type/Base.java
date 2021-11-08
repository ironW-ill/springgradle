package com.example.springgradle.type;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class Base {

    private String createUser;
    private Date createTime;

    private String updateUser;
    private Date updateTime;
}
