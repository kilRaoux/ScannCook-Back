package com.scanncook.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	private String description;
	private float note;
	
	//@ManyToOne
	private long authorid;

	@NotNull
	@CreatedDate
	private Date creationdate;
	
	@Transient
	private List<RecipeIngredient> ingredients;
	
	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
	private List<Tag> tags;
	
	@Transient
	private List<Comment> comments;
}

