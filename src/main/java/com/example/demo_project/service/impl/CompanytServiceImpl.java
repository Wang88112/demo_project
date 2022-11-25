package com.example.demo_project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Company;
import com.example.demo_project.entity.OrgCompanyId;
import com.example.demo_project.repository.CompanyDao;
import com.example.demo_project.service.ifs.CompanytService;
@Service
public class CompanytServiceImpl implements CompanytService {

	@Autowired
	public CompanyDao companyDao;
	
	@Override
	public List<Company> findAll() {
		List<Company> list = companyDao.findAll();
		return list;
	}

	@Override
	public Company findById(String orgId, String companyId) {
		OrgCompanyId orgCompanyId = new OrgCompanyId(orgId, companyId);
		Optional<Company> companyOp = companyDao.findById(orgCompanyId);
		//單一的物件(Company)用Optional包起來
//		if(companyOp.isPresent()) {
//			Company com = companyOp.get();
//			return com;
//		}
//		return new Company();  //如果felse就回傳
		return companyOp.orElse(new Company());
	}

	@Override
	public Company updateById(String orgId, String companyId) {
		OrgCompanyId orgCompanyId = new OrgCompanyId(orgId, companyId);
		Optional<Company> companyOp = companyDao.findById(orgCompanyId);
		//update name
		if(companyOp.isPresent()) {
			Company com = companyOp.get();
			com.setCompanyName("A02");
			Company newcom = companyDao.save(com);
			return newcom; 
		}
		return new Company();
	}

	@Override
	public Company saveCompany() {
		Company company = new Company("OD", "CD", "D01");
		return companyDao.save(company);
	}


}
