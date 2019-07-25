package com.scanncook.models;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String title;
	private String description;
	
	@ManyToOne
	private User author;
	
	@ManyToMany
	private List<Ingredient> ingredients;
	
	@UpdateTimestamp
	private Timestamp lastupdate;

	@NotNull
	@CreatedDate
	private Timestamp creationdate;
}
