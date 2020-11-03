package top.redautu.springboot05webrestfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/11/3.
 * @description:
 */
@Controller
public class HelloWorld {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello bigman";
	}


	@RequestMapping("/success")
	public String success(Map<String,Object> map){
		map.put("school","JLU");
		return "success";
	}
}
