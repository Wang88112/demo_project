package com.example.demo_project;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo_project.entity.Register;
import com.example.demo_project.repository.RegisterDao;
import com.example.demo_project.service.ifs.RegisterService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebAppConfiguration
@SpringBootTest(classes = DemoProjectApplication.class) // 來自專案下的project裡面的DemoProjectApplicationClass
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // 使用BeforeAll需要
public class RegisterTest {

	@Autowired
	private RegisterService registerService;

	@Autowired
	private RegisterDao registerDao;

	private static final String CONTENT_TYPE = "application/json;charset=UTF-8";

	@Autowired
	private WebApplicationContext wac;
	// 實現對http請求的模擬，主要用來測試controller
	private MockMvc mockMvc;

	@BeforeAll
	public void setup() { // 設定給mockMvc
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
//    @BeforeAll
//	public void beforeAll() {
//		System.out.println("before All!");
//	}

	@AfterAll
	public void afterAll() {
		System.out.println("After All");
	}

	@BeforeEach // 用於假資料
	public void BeforeEach() {
		System.out.println("Before Each!");
	}

	@SuppressWarnings("unchecked")
	@Test
	public void registerControllerTest() throws Exception {
    	//如果header有需要加其他參數，可使用此方式
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
    	
    	//set request_body
    	Map<String, Object> map = new LinkedHashMap<>();
    	map.put("account", "A99");
    	map.put("pwd", "A12345678");
    	map.put("name", "David");
    	map.put("age", 22);
    	map.put("city", "Tauwan");
    	//map to String
    	ObjectMapper objectMapper = new ObjectMapper();  //轉成字串
    	String mapString = objectMapper.writeValueAsString(map);
    	System.out.println(mapString);
    	
    	ResultActions result = mockMvc.perform(MockMvcRequestBuilders.post("/api/register")
    			.contentType(CONTENT_TYPE)  //39行  //Headers要加的參數只有content_type時可直接使用，無須透過Headers
    			//.headers(headers) 
    			.content(mapString));
    	    //get response && 將response內容轉為字串
    	
//    	MockHttpServletResponse httpResponse = result.andReturn().getRequest();  //96行
//    	Satring resString = httpResponse.getContentAsString();   //原本要的字串
    	
    	String resString = result.andReturn().getResponse().getContentAsString();
    	//將得到的response字串轉成Json(map)
    	JacksonJsonParser JsonParser = new JacksonJsonParser();
    	Map<String, Object> resData = JsonParser.parseMap(resString);  //將90行轉型成map
    	Object rtnMessage =(String) resData.get("message");
    	System.out.println(rtnMessage);
    	Assert.isTrue(rtnMessage.equals("Successful"), "Mseeage error!");
    	Map<String, Object>  rtnInfo = (Map<String, Object>)resData.get("register_info");
    	Assert.isTrue(((String)rtnInfo.get("account")).equals("A99"), "Account error!");
    	System.out.println(rtnInfo);
    	System.out.println(resData);
    }

	@Test
	public void registerTest() {
//		Register reg = registerService.register("A99", "12345678", "Alice", 18, "Tainan");
//		Assert.notNull(reg, "Result is null!");
//		Assert.isTrue(reg.getAccount().equalsIgnoreCase("A99"), "Account error!");
//		registerDao.delete(reg);
//
//		Assert.isTrue(!registerDao.findById("A99").isPresent(), "reg is not null!!");
//		Assert.isTrue(!registerDao.existsById("A99"), "reg is not null!!");
//
//		System.out.println("Register  Test!!");

	}

	@Test
	public void addRoleTest() {
		List<String> roleList = new ArrayList<>();
		roleList.add("SA");
		roleList.add("SD");
		roleList.add("SA");
		roleList.add("SD");
		registerService.addRole("A02", roleList);

		System.out.println("addRole Test!!");
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void addRoleListControllerTset() throws Exception {
		//如果header有需要加其他參數，可使用此方式
    	HttpHeaders headers = new HttpHeaders();  //多個參數使用
    	headers.setContentType(MediaType.APPLICATION_JSON);  //在postman裡面的Json ->Headers
    	
    	//set request_body
    	Map<String, Object> map = new LinkedHashMap<>();  //144 - 149 --> RequsetBody
    	List<String> roleList = new ArrayList<>();
    	roleList.add("AAA");
    	roleList.add("BBB");
    	map.put("account", "A02");
    	map.put("role_list", roleList);
    	//map to String
    	ObjectMapper objectMapper = new ObjectMapper();  //轉成字串
    	String mapString = objectMapper.writeValueAsString(map);
  
    	ResultActions result = mockMvc.perform(MockMvcRequestBuilders.post("/api/add_role_list")
    			.contentType(CONTENT_TYPE)  //39行  //Headers要加的參數只有content_type時可直接使用，無須透過Headers
    			//.headers(headers) 
    			.content(mapString));
    	    //get response && 將response內容轉為字串
    	
//    	MockHttpServletResponse httpResponse = result.andReturn().getRequest();  //96行
//    	Satring resString = httpResponse.getContentAsString();   //原本要的字串
    	
    	String resString = result.andReturn().getResponse().getContentAsString();
    	//將得到的response字串轉成Json(map)
    	JacksonJsonParser JsonParser = new JacksonJsonParser();
    	Map<String, Object> resData = JsonParser.parseMap(resString);  //將90行轉型成map
    	Object rtnMessage =(String) resData.get("message");
    	System.out.println(rtnMessage);
    	Assert.isTrue(rtnMessage.equals("Successful"), "Mseeage error!");  
		Map<String, Object>  rtnInfo = (Map<String, Object>)resData.get("register_info");
    	Assert.isTrue(((String)rtnInfo.get("account")).equals("A02"), "Account error!");
    	System.out.println(rtnInfo);
    	System.out.println(resData);
	
	}
}
