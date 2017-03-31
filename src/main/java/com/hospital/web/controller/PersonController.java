package com.hospital.web.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.web.domain.Command;
import com.hospital.web.domain.Person;
import com.hospital.web.mapper.Mapper;


@Controller
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@Autowired Mapper mapper;
	@RequestMapping(value="/register/{type}",method=RequestMethod.POST)
	public String register(
			@RequestParam(value="pageNo",defaultValue="1")int pageNo,
			@PathVariable String type,
			/*@ModelAttribute Patient patient //완전히 일치 할때! 사용*/			
			@RequestBody Map<String,Object>map,
			Command command) 
					throws Exception{
		command.process(map);
		logger.info("PersonController() {}","진입");
		if(type.equals("")){type="patient";}
		map.put("type",type);
		Person<?>person=command.process(map).getPersonInfo();  //person은 온갖것이 다 셋팅되어있음 
		int result=0;
		switch(type){
		case "patient":result=mapper.registPatient(person);break;
		case "nurse": result=mapper.registDoctor(person);break;
		case "doctor": result=mapper.registNurse(person);break;
		case "admin": 
			
			break;
		}
		if(result==1){
			return "public:common/loginForm";
		}else{
			return "redirect:/{group}/registerForm";
		}
	}
	
	@RequestMapping("/detail/{docID}")
	public String Detail(@PathVariable String docID){
		logger.info("PersonController() {}","진입");
		if(docID.equals("")){return "redirect:/{permission}/login";}
		return "public:common/loginForm";
		
	}


}
