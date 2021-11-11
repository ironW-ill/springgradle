package com.example.springgradle.domain.item.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ItemRepository {
    List<Map<String,Object>> itemGet();
}
