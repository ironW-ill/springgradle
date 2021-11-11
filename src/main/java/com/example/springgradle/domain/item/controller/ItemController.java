package com.example.springgradle.domain.item.controller;

import com.example.springgradle.domain.item.service.ItemService;
import com.example.springgradle.global.model.Message;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

@RequestMapping("item")
@RestController
public class ItemController {
    private ItemService itemserVice;

    private final static HttpHeaders headers = new HttpHeaders();
    private final static Message message = new Message();

    @GetMapping("")
    @ApiOperation(value="아이템 목록 조회", notes="전체 아이템 목록을 조회한다.")
    public ResponseEntity<Message> list() {
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        return new ResponseEntity<>(message, headers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation(value="유니크 아이템 상세 조회", notes="해당 아이템의 상세정보를 조회한다.")
    public ResponseEntity<Message> detail() {
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        return new ResponseEntity<>(message, headers, HttpStatus.OK);
    }
    @GetMapping("/getSearch")
    @ApiOperation(value="테스트조회", notes="해당 아이템의 상세정보를 조회한다.")
    public List<Map<String,Object>> getItem(){
        return itemserVice.testSearch();
    }

}
