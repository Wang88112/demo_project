package com.example.demo_project.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_project.entity.Bank;

@Repository  //�Ω��ƳB�z(CRUD)��SpringBoot�U��

public interface BankDao extends JpaRepository<Bank, String>{
             //JpaRepository(JPA)   String�O@Id(�D��)����쫬�A
	@Transactional
	public void deleteByName(String name);
	
	@Transactional
	public void deleteById(String account);
}
