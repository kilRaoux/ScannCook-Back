package com.scanncook.services.tag;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scanncook.models.Tag;
import com.scanncook.repositories.tag.TagRepository;

@Service
public class TagServiceImpl implements TagService{

	@Autowired
	private TagRepository tagRepository;
	
	public void save(Tag tag){
		tagRepository.save(tag);
	}

	@Override
	public Optional<Tag> findById(long id) {
		return tagRepository.findById(id);
	}

	@Override
	public List<Tag> findAll() {
		return tagRepository.findAll();
	}

	@Override
	public Optional<Tag> findByName(String name) {
		return tagRepository.findByName(name);
	}
}
