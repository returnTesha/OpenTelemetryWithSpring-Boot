package com.example.demo.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoService {

    public String greethings(){
        log.info("⚙️ [Service] 비즈니스 로직(greethings) 실행");
        return "greethings";
    }

    public String hello(){
        log.info("⚙️ [Service] 비즈니스 로직(hello) 실행");
        return "hello";
    }
}
