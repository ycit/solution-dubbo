package com.ycit.service.impl;

import com.ycit.service.HiService;

public class HiServiceImpl implements HiService {

    public void hi(String name) {
        System.out.printf("hi, %s", name);
    }

}
