package com.ycit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[]args)throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hi-provider.xml");
        context.start();
        System.in.read();
    }

}
