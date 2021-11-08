package com.example.springgradle.type;

public enum StatusEnum {
    OK(200, "OK"),
    BAD_REQUEST(400, "BAD_REQUEST"),
    NOT_FOUND(404, "NOT_FOUND"),
    INTERNAL_SERVER_ERROR(500, "INTERNAL-SERVER_ERROR");

    private Integer statusCode;
    private String code;

    StatusEnum(Integer statusCode, String code) {
        this.statusCode = statusCode;
        this.code = code;
    }

}
