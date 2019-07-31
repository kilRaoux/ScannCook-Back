package com.scanncook.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LogModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String type;
	private String msg;
	
	public LogModel(String type, String msg) {
		this.type = type;
		this.msg = msg;
	}
	
}
