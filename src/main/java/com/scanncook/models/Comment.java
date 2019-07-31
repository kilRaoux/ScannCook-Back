package com.scanncook.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Comment {

	@Id
	private long id;
	
	private String comment;
	private float note;
	private Date creationdate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User author;
	
	private long recipeid;
}
