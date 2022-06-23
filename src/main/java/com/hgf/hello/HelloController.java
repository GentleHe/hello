package com.hgf.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author GentleHe
 * @Date 2022/6/23
 * @Description
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name){
        return "hello " +name;
    }
}
