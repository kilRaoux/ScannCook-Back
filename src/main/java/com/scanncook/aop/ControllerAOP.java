package com.scanncook.aop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ControllerAOP {

	private static Logger logger = LogManager.getLogger(ControllerAOP.class);
	@Before("execution(* com.scanncook.controllers.*Controller.getAll(..))")
	public void beforeGET(JoinPoint jp) {
		logger.info("HTTP:GET>"+jp.getTarget());
	}
}
