package com.example.demo_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_project.entity.Menuu;
import com.example.demo_project.service.ifs.OrderrService;
import com.example.demo_project.vo.Menu1Res;
import com.example.demo_project.vo.MenuuReq;
import com.example.demo_project.vo.MenuuRes;

@RestController // = @Controller + @ResponesBody
public class OrderrController {
	
	@Autowired
	private OrderrService orderrService;
   
	@PostMapping(value = "/api/createName")
	public MenuuRes createName(@RequestBody MenuuReq req) {
		MenuuRes res = new MenuuRes();
		  if(orderrService.createName(req.getName(), req.getPrice()) == null) {
			  res.setName(req.getName());
			  res.setPrice(req.getPrice());
			  res.setMessage("餐點品項錯誤!");
			  return res;
		  }
//		  if(StringUtils.hasText(req.getName())){
//			  res.setMessage("餐點品項錯誤!");
//			  return res;
//		  }

		  return res;
		  
//           if(orderrService.createName(req.getName(), req.getPrice()) == null) {
//        	   res.setMessage("品項不能為空!");
//        	   return res;
//           }else if(orderrService.){
//        	   res.setMessage("品項已存在!");
//        	   return res;
//           }
//   
//		}
//		
//		return orderrService.createName(req.getName(), req.getPrice());
	}
	
	@PostMapping(value = "/api/getMenus")  //@PostMapping提供
	public List<Menuu> getMenus(){
		List<Menuu> menuList = orderrService.getMenus();
		return menuList;
	}
	
	@PostMapping(value = "/api/getMenu")
	public Menu1Res getMenu(@RequestBody MenuuReq req) {
        return orderrService.getMenu(req.getName());
	}
	
	@PostMapping(value = "/api/order")
	public MenuuRes order(@RequestBody List<MenuuReq> orderList) {
		return orderrService.order(orderList);
		
	}
}




