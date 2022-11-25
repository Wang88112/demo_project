package com.example.demo_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_project.constants.RegisterRtnCode;
import com.example.demo_project.entity.Register;
import com.example.demo_project.service.ifs.RegisterService;
import com.example.demo_project.vo.AddRoleListReq;
import com.example.demo_project.vo.AddRoleSetReq;
import com.example.demo_project.vo.RegisterReq;
import com.example.demo_project.vo.RegisterRes;

@RestController
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping(value = "/api/register")
	public RegisterRes register(@RequestBody RegisterReq req) {
		RegisterRes checkResult = checkParam(req);
		if(checkResult != null) {   //已將判斷式另寫私有方法(下方)
			return checkResult;
		}
		Register reg = registerService.register(req.getAccount(), req.getPwd(), req.getName(), 
				req.getAge(), req.getCity());
		if(reg == null) {
			return new RegisterRes(RegisterRtnCode.ACCOUNT_EXISTED.getMessage());
		}
		return new RegisterRes(reg,RegisterRtnCode.SUCCESSFUL.getMessage());
		
	}
    private RegisterRes checkParam(RegisterReq req) {
    	//account,pwd,name,cannot be null or empty
    			if(!StringUtils.hasText(req.getAccount())) {
    				return new RegisterRes(RegisterRtnCode.ACCOUNT_REQUIRED.getMessage());
    			}else if(!StringUtils.hasText(req.getPwd())) {
    				return new RegisterRes(RegisterRtnCode.PWD_REQUIRED.getMessage());
    			}else if(!StringUtils.hasText(req.getName())) {
    				return new RegisterRes(RegisterRtnCode.NAME_REQUIRED.getMessage());
    			}
    	return null;
    }
    
    @PostMapping(value = "/api/active_account")
    public RegisterRes activeAccount(@RequestBody RegisterReq req) {
    	if(StringUtils.hasText(req.getAccount())) {
    		return new RegisterRes(RegisterRtnCode.ACCOUNT_REQUIRED.getMessage());
    	}
    	return registerService.activeAccount(req.getAccount());
//    	if(result) {     //直接寫在Impl，return回去
//    		return new RegisterRes(null,RegisterRtnCode.SUCCESSFUL.getMessage());
//    	}
//		return new RegisterRes(null,RegisterRtnCode.FAILURE.getMessage());
//    	
    }
    
    @PostMapping(value = "/api/add_role_list")
    public RegisterRes addRoleList(@RequestBody AddRoleListReq req) {
    	if(!StringUtils.hasText(req.getAccount())) {  //判斷account存在與否
    		return new RegisterRes(RegisterRtnCode.ACCOUNT_REQUIRED.getMessage());
    	}
///    	if(req.getRoleList().isEmpty()) {
    	if(CollectionUtils.isEmpty(req.getRoleList())) {
    		return new RegisterRes(RegisterRtnCode.ROLE_LIST_IS_EMPRY.getMessage());
    	}
		return registerService.addRole(req.getAccount(), req.getRoleList());
    }
    
    
    @PostMapping(value = "/api/add_role_set")
    public RegisterRes addRoleSet(@RequestBody AddRoleSetReq req) {
    	if(!StringUtils.hasText(req.getAccount())) {  //判斷account存在與否
    		return new RegisterRes(RegisterRtnCode.ACCOUNT_REQUIRED.getMessage());
    	}
//    	if(req.getRolrSet() == null || req.getRolrSet().isEmpty()) {
    	if(CollectionUtils.isEmpty(req.getRolrSet())) {	
    		return new RegisterRes(RegisterRtnCode.ROLE_LIST_IS_EMPRY.getMessage());
    	}
		return registerService.addRoleSet(req.getAccount(), req.getRolrSet());
    }

}
