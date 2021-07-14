package com.developer.api.dao;


import com.developer.api.dao.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperDao extends JpaRepository<Developer, Long> {
}
