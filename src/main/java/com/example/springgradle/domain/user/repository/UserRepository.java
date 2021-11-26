package com.example.springgradle.domain.user.repository;

import com.example.springgradle.domain.user.dto.UserReqDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserRepository {
    List<Map<String,Object>> userGet(UserReqDto userReqDto);
}
