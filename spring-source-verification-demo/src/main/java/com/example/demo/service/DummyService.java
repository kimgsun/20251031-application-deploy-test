package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public void checkNull() {
        String str = null;
        try {
            System.out.println(str.length());
        } catch(NullPointerException e) {
            System.out.println("NullPointException");
        }
    }
}
