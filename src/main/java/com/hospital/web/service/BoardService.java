package com.hospital.web.service;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.web.domain.Admin;
import com.hospital.web.domain.Chart;
import com.hospital.web.domain.Doctor;
import com.hospital.web.domain.Nurse;
import com.hospital.web.domain.Patient;
import com.hospital.web.mapper.Mapper;

@Service
public class BoardService {
	private static final Logger logger = LoggerFactory.getLogger(PersonService.class);
	@Autowired Mapper mapper;
	@Transactional 
	@SuppressWarnings("unchecked")
	public List<Chart> board(Map<?,?> paramMap)throws Exception{
		IGetService service= (map)->mapper.articleList(map); 
		List<Chart> list= (List<Chart>) service.execute(paramMap);
		logger.info("BoardService-chartList {}","enter");
		return list;
	}
}
