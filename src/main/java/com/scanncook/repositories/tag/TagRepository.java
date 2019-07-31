package com.scanncook.repositories.tag;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.Tag;

public interface TagRepository extends JpaRepository<Tag, Long>{

	public Optional<Tag> findByName(String name);
}
