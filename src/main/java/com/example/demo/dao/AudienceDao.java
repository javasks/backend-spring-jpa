package com.example.demo.dao;

import com.example.demo.entity.Audience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudienceDao extends JpaRepository<Audience,Long> {
}
