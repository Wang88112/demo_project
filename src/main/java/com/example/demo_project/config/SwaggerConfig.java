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
//@Configuration  //��spring�Ӹ��J�����O�]�w
//@EnableSwagger2  //�ҥ�swagger2��ƫإ� Docket ��bean
//public class SwaggerConfig {
//	
//	/**
//	 * �إ�API���򥻸�T(�o�ǰ򥻸�T��ܦb��󭶭�)
//	 * �y�X����:http://�M�~���Ip:port/swagger-ui.html
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
//				.apiInfo(DEFAULT_API_INFO)//���api�򥻸�T�A�i���[
//				.select()  //�^�Ǥ@��ApiSelectorBuilder��ҡA�Ψӱ�����C�����i�H�Ψӵ�Swagger�i�{
//				//�]�w�M�󱽴y���|
//				//Swagger�|���y�M��U�Ҧ���controller�w�q��API�ò��ͤ��
//				//�Y���QAPI���ͬ������A�i�bAPI�W�[�W@ApiIgnore
//				.apis(RequestHandlerSelectors.basePackage("com.example.demo_project.controller"))
//				.paths(PathSelectors.any())
//                .build();
//	}
//}
