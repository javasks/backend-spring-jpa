package com.example.demo.dao;

import com.example.demo.entity.OnlineBookStore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OnlineBookStoreDao extends JpaRepository<OnlineBookStore,Long> {

  public OnlineBookStore findByAuthorName(String authorName);

  public List<OnlineBookStore> findByPlatoForm(String platoForm);
}

