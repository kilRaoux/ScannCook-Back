package com.scanncook.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
public class Ingredient {
	
	@Id
	@NotNull
	private Long id;
	
	@NotNull 
	private String name;

}
