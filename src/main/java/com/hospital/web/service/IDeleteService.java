package com.hospital.web.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
@FunctionalInterface
public interface IDeleteService {
	public int execute(Object o)throws Exception;

}