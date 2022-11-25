package com.example.demo_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_project.entity.Menuu;

@Repository  //用於資料處理(CRUD)讓SpringBoot託管
public interface MenuDao extends JpaRepository<Menuu, String> {
                                          //<Entity, Entity的@Id屬性>
}
