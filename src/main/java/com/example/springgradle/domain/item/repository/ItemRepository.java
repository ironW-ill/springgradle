package com.example.springgradle.domain.item.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface ItemRepository {
    List<Map<String,Object>> getItem();
}
