package com.example.springgradle.domain.user.service;

import com.example.springgradle.domain.user.dto.UserReqDto;
import com.example.springgradle.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<Map<String,Object>> userGet(UserReqDto UserReqDto){
        return userRepository.userGet(UserReqDto);
    }
}
