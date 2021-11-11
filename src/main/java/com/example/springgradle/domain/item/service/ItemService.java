package com.example.springgradle.domain.item.service;

import com.example.springgradle.domain.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemDao;

    public List<Map<String,Object>> itemGet(){
        return itemDao.itemGet();
    }
}
