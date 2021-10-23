package com.example.demo.dao;

import com.example.demo.entity.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowsDao extends JpaRepository<Shows,Long> {
}
