package com.example.demo_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_project.entity.Menuu;

@Repository  //�Ω��ƳB�z(CRUD)��SpringBoot�U��
public interface MenuDao extends JpaRepository<Menuu, String> {
                                          //<Entity, Entity��@Id�ݩ�>
}
