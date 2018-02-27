package com.demo.template.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("测试查询")
@RestController
public class HelloController {

	@ApiOperation(value = "一个测试API", notes = "第一个测试api")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello world!";
	}
	
}
