package com.example.demo.dao;

import com.example.demo.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityDao extends JpaRepository<University,Long> {
}
