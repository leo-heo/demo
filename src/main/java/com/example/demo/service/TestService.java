package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by LeoHeo 2018. 8. 17.
 */
@Service
public class TestService {

    public void test() {
        throw new IllegalArgumentException("test");
    }
}
