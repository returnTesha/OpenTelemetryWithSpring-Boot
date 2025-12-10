package com.example.demo.domain.web;

import com.example.demo.domain.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/demo")
public class DemoController {

    private final DemoService demoService;
    @GetMapping("/greethings")
    public ResponseEntity greethings(){
        log.info("📢 [Controller] /api/demo/greethings 요청");
        return ResponseEntity.status(HttpStatus.OK).body(demoService.greethings());
    }

    @GetMapping("/hello")
    public ResponseEntity hello(){
        log.info("📢 [Controller] /api/demo/hello 요청");
        return ResponseEntity.status(HttpStatus.OK).body(demoService.hello());
    }
}
