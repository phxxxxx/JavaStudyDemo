package top.redautu.springboot01helloquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/11/1.
 * @description:
 */

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "LAUGH";
	}
}
