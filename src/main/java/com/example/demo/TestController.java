package com.example.demo;

import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By LeoHeo
 * Date 2018. 8. 11.
 */
@Slf4j
@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public String test() {
        return "test";
    }

    @GetMapping("/test2")
    public String error() {
        testService.test();
        return "test22";
    }
}
