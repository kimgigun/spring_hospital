package com.hospital.web.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.web.domain.PatientDTO;
import com.hospital.web.mapper.PatientMapper;
import com.hospital.web.service.PatientService;

@Service

public class PatientServiceImpl implements PatientService{
	private static final Logger logger = LoggerFactory.getLogger(PatientServiceImpl.class);
	@Autowired PatientMapper mapper;
/*	@Autowired PatientDAO dao;*/
	
	
	@Override
	public int join(PatientDTO patient)  throws Exception{
		logger.info("PatientServiceImpl {} insert!! ", "join진입");
		return mapper.insert(patient);
	}

	@Override
	public PatientDTO findById(String id) throws Exception {
		logger.info("PatientServiceImpl {} insert!! ", "impl진입");
		return mapper.selectById(id);
	}

	@Override
	public PatientDTO login(PatientDTO member) throws Exception {
		logger.info("PatientServiceImpl {} insert!! ", "impl진입");
		return mapper.selectById(member.getPatID());
	
	}

	@Override
	public int change(PatientDTO patient) throws Exception {
		logger.info("PatientServiceImpl {} insert!! ", "impl진입");
		return mapper.update(patient);
	}

	@Override
	public int remove(PatientDTO patient)  throws Exception{
		logger.info("PatientServiceImpl {} insert!! ", "impl진입");
		return mapper.delete(patient);
	}

	@Override
	public boolean logout(PatientDTO patient) throws Exception {
		logger.info("PatientServiceImpl {} insert!! ", "impl진입");
		return true;
	}

	@Override
	public String getBirth(String patJumin) {
		logger.info("PatientServiceImpl {} insert!! ", "impl진입");

		return getBirth(null);
	}

	@Override
	public PatientDTO getSession() {
		logger.info("PatientServiceImpl {} insert!! ", "impl진입");
		return null;
	}

	@Override
	public int count() throws Exception {
		logger.info("PatientServiceImpl {} count!! ", "count 진입");
		return mapper.count();
	}
	

}