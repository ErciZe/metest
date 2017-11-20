package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
/*	@Autowired
	private Environment en;
	
	@Value("${name}")
	private String name;
	
	@Value("${url}")
	private String url;
	
	// http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello(){
		System.out.println(en.getProperty("name"));
		System.out.println(en.getProperty("url"));
		System.out.println("----------------------");
		System.out.println(name);
		System.out.println(url);
		
		return "Hello World";
	}
	*/
	// 响应数据为静态html页面： http://localhost:8080/user
	@GetMapping("/user11")
	public String user(){
		return "/html/user.html";
	}
	
	
}
