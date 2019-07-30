package com.scanncook.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scanncook.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByFirstname(String name);

}
