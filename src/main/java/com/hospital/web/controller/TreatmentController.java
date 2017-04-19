package com.hospital.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.web.domain.Admin;
import com.hospital.web.domain.Doctor;
import com.hospital.web.domain.Nurse;
import com.hospital.web.domain.Patient;
import com.hospital.web.mapper.Mapper;

@RestController
public class TreatmentController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@Autowired Mapper mapper;
	@Autowired Patient patient;
	@Autowired Doctor doctor;
	@Autowired Nurse nurse;
	@Autowired Admin admin;
	@RequestMapping(value ="/get/chart", method = RequestMethod.POST,consumes="application/json")
	public @ResponseBody Map<?,?> getChart(
			@RequestBody Patient p)

	throws Exception {
		logger.info("TreatmentController-getChart() {} ","enter");
		Map<String,String>map =new HashMap<>();
		map.put("chart", "차트조회성공");
		return map;
	}
}
