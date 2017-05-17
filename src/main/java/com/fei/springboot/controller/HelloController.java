package com.fei.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fei.springboot.config.ClassConfig;
import com.fei.springboot.config.StudentConfig;

@Controller
@RequestMapping("/")
public class HelloController {

	public static Logger LOG = LoggerFactory.getLogger(HelloController.class);
	
	@Value("${hello}")
	private String hello;
	
	@Value("${class.schoolName}")
	private String schoolName;
	
	@Autowired
	private ClassConfig classConfig;
	
	@Autowired
	private StudentConfig studentConfig;
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String hello(){
		System.out.println("=======使用@Value注入获取.....===========");
		System.out.println("hello="+hello+"   schoolName=" + schoolName);
		System.out.println("======使用@ConfigurationProperties注入获取.....============");
		System.out.println("schoolName=" + classConfig.getSchoolName());
		System.out.println("className=" + classConfig.getClassName());
		System.out.println("student[0].name=" + classConfig.getStudents().get(0).getName());
		
		System.out.println("studentConfig...name=" + studentConfig.getName());
		
		return "hello";
	}
}
