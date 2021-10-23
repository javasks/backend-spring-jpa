package com.example.demo.dao;

import com.example.demo.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestDao extends JpaRepository<TestEntity, Long> {

   public List<TestEntity> findByFirstName(String firstName);

   public List<TestEntity> findByLastName(String lastName);

}
