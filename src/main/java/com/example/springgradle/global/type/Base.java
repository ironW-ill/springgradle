package com.example.springgradle.global.type;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
public class Base implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer no;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;
}
