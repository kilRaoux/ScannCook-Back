package com.scanncook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.Tag;

public interface TagRepository extends JpaRepository<Tag, Long>{

}
