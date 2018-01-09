package com.gx;

import org.springframework.stereotype.Component;

@Component
public class TestImpl implements Test {
    @Override
    public void out(){
        System.out.println("hello test");
    }
}
