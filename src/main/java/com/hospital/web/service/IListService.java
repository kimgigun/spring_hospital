package com.hospital.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
@FunctionalInterface
public interface IListService {
	public List<?> execute(Map<?,?> paramMap)throws Exception;

}
