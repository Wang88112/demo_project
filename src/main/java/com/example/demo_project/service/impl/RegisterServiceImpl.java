package com.example.demo_project.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_project.constants.RegisterRtnCode;
import com.example.demo_project.entity.Register;
import com.example.demo_project.repository.RegisterDao;
import com.example.demo_project.service.ifs.RegisterService;
import com.example.demo_project.vo.RegisterRes;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDao registerDao;

	@Override
	public Register register(String account, String pwd, String name, int age, String city) {
		// 不能註冊已存在帳號
		if (registerDao.existsById(account)) {
			return null;
		}
		Register reg = new Register(account, pwd, name, age, city);
		reg.setRegTime(new Date()); // new Date()代表系統當前時間
//		reg.setActive(false); 布林值預設為false，故此行可不寫
		reg.setRole("General");
		return registerDao.save(reg);
	}

	@Override
	public RegisterRes activeAccount(String account) {
		Optional<Register> regOp = registerDao.findById(account);
		if (regOp.isPresent()) {
			Register reg = regOp.get();
			reg.setActive(true);
			registerDao.save(reg);
			return new RegisterRes(null, RegisterRtnCode.SUCCESSFUL.getMessage());
		}
		return new RegisterRes(null, RegisterRtnCode.FAILURE.getMessage());
	}

	@Override
	public RegisterRes addRole(String account, List<String> roleList) {
		Optional<Register> regOp = registerDao.findById(account);
		if (regOp.isPresent()) {
			Set<String> roleSet = new HashSet<>(); // Set:不允許重複
			// 去除(roleList)參數裡的重複值
			for (String str : roleList) {
				roleSet.add(str);
			}
			// 去除 DB裡面已經存在的值 和 參數值，兩者的重複部分
			Register reg = regOp.get(); // 以陣列形式呈現，因此使用逗號區隔 ex:[X, X, X]
			String role = reg.getRole(); // DB裡面的資料用','切分
			String[] roleArray = role.split(","); // 可能會有多個，用逗號(,)區隔;例如:General, SA, PM
			for (String item : roleArray) {
				String str = item.trim();
				roleSet.add(str);
			}
//			    for(int i =0; i < roleArray.length; i++) {  //取出來比對
//			    	String item = roleArray[i].trim();  //trim():去除字串前後空白
//			    	roleSet.add(item);      //重複的刪除在加回去
//			    }
//			    System.out.println(roleSet.toString());
//			    StringBuffer newStr = new StringBuffer();
//			    for(String item : roleSet) {
//			    	newStr.append(item.trim());
//			    }
//			    reg.setRole(roleSet.toString());  //toString()轉字串
//			    reg.setRole(roleSet.toString().substring(1, 7));
//			    reg.setRole(roleSet.toString().substring(1, roleSet.toString().length() - 1));
			String newStr = roleSet.toString().substring(1, roleSet.toString().length() - 1);
			reg.setRole(newStr);
			registerDao.save(reg);
			return new RegisterRes(reg, RegisterRtnCode.SUCCESSFUL.getMessage());
		}
		return new RegisterRes(null, RegisterRtnCode.ADD_ROLE_FAILURE.getMessage());
	}

	@Override
	public RegisterRes addRoleSet(String account, Set<String> roleSet) {
		Optional<Register> regOp = registerDao.findById(account);
		if (regOp.isPresent()) {
			// 去除 DB裡面已經存在的值 和 參數值，兩者的重複部分
			Register reg = regOp.get(); // 以陣列形式呈現，因此使用逗號區隔 ex:[X, X, X]
			String role = reg.getRole(); // DB裡面的資料用','切分
			String[] roleArray = role.split(","); // 可能會有多個，用逗號(,)區隔;例如:General, SA, PM
			for (String item : roleArray) {
				String str = item.trim();
				roleSet.add(str);
			}
//			    for(int i =0; i < roleArray.length; i++) {  //取出來比對
//			    	String item = roleArray[i].trim();  //trim():去除字串前後空白
//			    	roleSet.add(item);      //重複的刪除在加回去
//			    }
//			    System.out.println(roleSet.toString());
//			    StringBuffer newStr = new StringBuffer();
//			    for(String item : roleSet) {
//			    	newStr.append(item.trim());
//			    }
//			    reg.setRole(roleSet.toString());  //toString()轉字串
//			    reg.setRole(roleSet.toString().substring(1, 7));
//			    reg.setRole(roleSet.toString().substring(1, roleSet.toString().length() - 1));
			String newStr = roleSet.toString().substring(1, roleSet.toString().length() - 1);
			reg.setRole(newStr);
			registerDao.save(reg);
			return new RegisterRes(reg, RegisterRtnCode.SUCCESSFUL.getMessage());
		}
		return new RegisterRes(null, RegisterRtnCode.ADD_ROLE_FAILURE.getMessage());
	}

}