package com.scanncook.repositories.log;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.LogModel;

public interface LogRepository extends JpaRepository<LogModel, Long>{

}
