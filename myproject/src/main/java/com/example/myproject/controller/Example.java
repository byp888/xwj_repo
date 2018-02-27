package com.example.myproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.bean.Config;

/**
 * @author xuwenjin
 *
 * 测试SpringBoot
 */
@RequestMapping("/")
@RestController
public class Example {
	
	@RequestMapping
	public String home() {
        return "Hello World-xwj!";
    }
	
	@RequestMapping("/hello/{myName}")
	public String index(@PathVariable String myName) {
		return "Hello " + myName + "xuwenjin!!!";
	}
	
	@RequestMapping("/config")
	public String index() {
		return Config.getVal();
	}
	
}
