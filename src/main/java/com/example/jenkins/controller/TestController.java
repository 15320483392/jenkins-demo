package com.example.jenkins.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WTar
 * @date 2020/9/1 11:18
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("su")
    public String tests(){
        return "SUCCESS";
    }
}
