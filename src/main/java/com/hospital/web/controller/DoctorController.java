package com.hospital.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping
	public String goLogin(){
		logger.info("DoctorController() {}","진입");
		return "public:common/loginForm";
		
	}
	
	@RequestMapping("/detail/{docID}")
	public String Detail(@PathVariable String docID){
		logger.info("DoctorController() {}","진입");
		return "public:common/loginForm";
		
	}


}
