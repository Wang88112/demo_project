package com.example.demo_project.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_project.entity.Bank;

@Repository  //用於資料處理(CRUD)讓SpringBoot託管

public interface BankDao extends JpaRepository<Bank, String>{
             //JpaRepository(JPA)   String是@Id(主鍵)的欄位型態
	@Transactional
	public void deleteByName(String name);
	
	@Transactional
	public void deleteById(String account);
}
