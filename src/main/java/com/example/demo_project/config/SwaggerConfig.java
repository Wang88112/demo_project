//package com.example.demo_project.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration  //讓spring來載入此類別設定
//@EnableSwagger2  //啟用swagger2函數建立 Docket 的bean
//public class SwaggerConfig {
//	
//	/**
//	 * 建立API的基本資訊(這些基本資訊顯示在文件頁面)
//	 * 造訪網站:http://專業實際Ip:port/swagger-ui.html
//	 */
//
//	public static final ApiInfo DEFAULT_API_INFO = new ApiInfoBuilder() 
//			.title("Restful ")
//			.build();
//		
//	
//
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.apiInfo(DEFAULT_API_INFO)//顯示api基本資訊，可不加
//				.select()  //回傳一個ApiSelectorBuilder實例，用來控制哪耶介面可以用來給Swagger展現
//				//設定套件掃描路徑
//				//Swagger會掃描套件下所有的controller定義的API並產生文件
//				//若不想API產生相關文件，可在API上加上@ApiIgnore
//				.apis(RequestHandlerSelectors.basePackage("com.example.demo_project.controller"))
//				.paths(PathSelectors.any())
//                .build();
//	}
//}
