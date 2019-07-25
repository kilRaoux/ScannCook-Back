package com.scanncook.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
public class User {
	@Id 
	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	@Basic
	private Date birthdate;
	private Timestamp firstlogdate;
}
