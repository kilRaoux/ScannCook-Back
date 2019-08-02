package com.scanncook.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Step {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int number;
	private String name;
	private String description;
	
}
