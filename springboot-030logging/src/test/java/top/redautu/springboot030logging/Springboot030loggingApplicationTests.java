package top.redautu.springboot030logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot030loggingApplicationTests {

	//日志记录器
	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	void contextLoads() {

		//日志级别由低到高
		//trace<debug<info<warn<error
		//可以调整级别,只输出本级别及更高的
		logger.trace("this is trace log....");
		logger.debug("this is debug log....");
		logger.info("this is info log....");
		logger.warn("this is warn log....");
		logger.error("this is error log....");

	}

}
