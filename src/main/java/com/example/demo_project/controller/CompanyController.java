package com.example.demo_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_project.entity.Company;
import com.example.demo_project.service.ifs.CompanytService;
import com.example.demo_project.vo.CompanyReq;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanytService companytService;
	
	@PostMapping(value = "/api/getCompanies")
	public List<Company> findAll(){
		List<Company> com = companytService.findAll();
		return com;
	}
	
	@PostMapping(value = "/api/getCompaniesId")
	public Company findById(@RequestBody CompanyReq req) {
		return companytService.findById(req.getOrgId(), req.getCompanyId());
	}
	
	@PostMapping(value = "/api/getupdateById")
	public Company updateById(@RequestBody CompanyReq req) {
		return companytService.findById(req.getOrgId(), req.getCompanyId());
	}
	
	@PostMapping(value = "/api/getsaveCompany")
	public Company saveCompany() {
		return companytService.saveCompany();
	}
}
