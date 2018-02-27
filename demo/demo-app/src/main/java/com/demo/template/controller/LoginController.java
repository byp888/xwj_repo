package com.demo.template.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.template.vo.PersonVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("用户信息API")
@RestController
public class LoginController {

	/** 日志 */
	private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@ApiOperation(value = "演示查询所有的人员信息", notes = "查询所有的人员信息", response = PersonVO.class, responseContainer = "List")
	@ApiResponses(value = { @ApiResponse(code = 404, message = "person not found") })
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	@ResponseBody
	public List<PersonVO> personList() {
		List<PersonVO> result = new ArrayList<>();
		PersonVO p1 = new PersonVO("Dave", "Syer");
		result.add(p1);
		PersonVO p2 = new PersonVO("Dave", "Syer1");
		result.add(p2);
		return result;
	}

	@ApiOperation(value = "演示新增一个人员", notes = "新增一个人员", response = PersonVO.class)
	@RequestMapping(value = "/person", method = RequestMethod.POST)
	@ResponseBody
	public PersonVO addPerson(@ApiParam("人员VO") @RequestBody PersonVO vo) {
		LOGGER.info("新增人员信息: " + vo.toString());
		return vo;
	}

	@ApiOperation(value = "演示根据条件查询", notes = "根据firstName查询人员信息", response = PersonVO.class, responseContainer = "List")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid firstName supplied"),
			@ApiResponse(code = 404, message = "person not found") })
	@RequestMapping(value = "/persons/{firstName}", method = RequestMethod.GET)
	@ResponseBody
	public List<PersonVO> queryPersonByFirstName(@ApiParam(value = "姓名") @PathVariable String firstName) {
		List<PersonVO> result = new ArrayList<>();
		PersonVO p1 = new PersonVO("Dave", "Syer");
		result.add(p1);
		PersonVO p2 = new PersonVO("Dave", "Syer1");
		result.add(p2);
		return result;
	}
}
