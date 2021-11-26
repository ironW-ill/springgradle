package com.example.springgradle.domain.user.controller;

import com.example.springgradle.domain.user.dto.UserReqDto;
import com.example.springgradle.domain.user.service.UserService;
import com.example.springgradle.global.model.Message;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j //log.info()
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    private final static HttpHeaders headers = new HttpHeaders();
    private final static Message message = new Message();

    @GetMapping("/userList")
    @ApiOperation(value="유저목록조회", notes="유저정보 조회")
    public List<Map<String,Object>> userList(UserReqDto userReqDto) {
        return userService.userGet(userReqDto);
    }

}
