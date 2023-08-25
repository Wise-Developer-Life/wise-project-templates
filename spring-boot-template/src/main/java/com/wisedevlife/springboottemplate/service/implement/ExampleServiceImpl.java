package com.wisedevlife.springboottemplate.service.implement;

import com.wisedevlife.springboottemplate.service.ExampleService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ExampleServiceImpl implements ExampleService {
    public void printHelloWorld() {
        System.out.println("Hello World!");
    }
}
