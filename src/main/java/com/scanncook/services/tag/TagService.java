package com.scanncook.services.tag;

import java.util.List;
import java.util.Optional;

import com.scanncook.models.Tag;

public interface TagService {
	
	public void save(Tag tag);
	public Optional<Tag> findById(long id);
	public List<Tag> findAll();
	public Optional<Tag> findByName(String name);
	
}
