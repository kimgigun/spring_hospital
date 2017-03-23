package com.hospital.web.dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hospital.web.domain.PatientDTO;

@Component
public interface PatientDAO {
	public int insert(PatientDTO member)throws Exception;
	public PatientDTO selectById(String id)throws Exception;
/*	public boolean login(PatientBean member)throws Exception;*/
	public int update(PatientDTO member) throws Exception;
	public int delete(PatientDTO member)throws Exception;

}
