package com.hospital.web.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;


import com.hospital.web.domain.PatientDTO;
import com.hospital.web.imapper.IPatientMapper;
@Repository
public class PatientMapper implements IPatientMapper{
	private static final Logger logger = LoggerFactory.getLogger(PatientMapper.class);
	@Autowired
	private SqlSessionTemplate sqlSession;
	String namespace="com.hospital.web.mapper.PatientMapper";
	
	@Override
	public int insert(PatientDTO member) throws Exception {
		logger.info("PatientMapper {} insert!! ", "impl진입");
		return 0;
	}

	@Override
	public PatientDTO selectById(String id) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".selectById",id);
	}

	@Override
	public int update(PatientDTO member) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(PatientDTO member) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count() throws Exception {
		logger.info("PatientMapper {} count","count 진입");
		return sqlSession.selectOne(namespace+".count");
	}

	@Override
	public int exist(String id) throws Exception {
		logger.info("PatientMapper - exist() {}","Enter");
		return sqlSession.selectOne(namespace+".exist",id);
	}

}
