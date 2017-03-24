package com.hospital.web.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/patient")
public class PatientController {
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	@RequestMapping(value="/join")
	public String goJoin(){
		logger.info("PatientController {} goJoin!! ", "진입");
		return "public:patient/registerForm";
	}
	@RequestMapping(value="/login")
	public String goLogin(){
		logger.info("PatientController {} goLogin!! ", "진입");
		return "public:patient/loginForm";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String goLogin(Model model){
		logger.info("PatientController {} goLogin!! ", "POST진입");
		model.addAttribute("name", "홍길동");
		return "patient:patient/containerDetail";
	}
	@RequestMapping(value="/doctor/{docID}")
	public String info(@PathVariable String docID){
	logger.info("PatientController {} goLogin!! ", "진입");		
	logger.info("PatientController docID={}!! ",docID);	
	return "patient:patient/doctorInfo";
		}	
		
		
}

