package com.example.springgradle.domain.item.service;

import com.example.springgradle.domain.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ItemService {
    private ItemRepository itemDao;

    @Autowired
    public ItemService(ItemRepository itemDao){
        this.itemDao = itemDao;
    }

    public List<Map<String,Object>> testSearch(){
        return itemDao.getItem();
    }
}
