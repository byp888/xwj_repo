package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {
	
	/** 日志 */
    protected static Logger LOGGER = LoggerFactory.getLogger(DemoApplicationTest.class);
	
	@Test
	public void test() {
		LOGGER.info("=========测试环境构建完毕========");
	}
	
}
