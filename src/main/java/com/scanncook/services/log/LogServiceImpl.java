package com.scanncook.services.log;

import org.springframework.beans.factory.annotation.Autowired;

import com.scanncook.models.LogModel;
import com.scanncook.repositories.log.LogRepository;

public class LogServiceImpl implements LogService{

	@Autowired
	private LogRepository logRepository;
	
	public void save(String type, String msg) {
		logRepository.save(new LogModel(type, msg));
	}
}
