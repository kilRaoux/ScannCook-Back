package com.scanncook.models;

import java.util.List;

import lombok.Data;

@Data
public class RecipeSearch {

	private List<Ingredient> ingredients;
	private List<Tag> tags;
	
}
/*
{
	"ingredients":[
		{"id":25},
		{"id":75861},
		{"id":4}
	],
	"tags":[
		{"id":4}
	]
	
}





*/