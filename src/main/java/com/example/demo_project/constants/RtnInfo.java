package com.example.demo_project.constants;

public enum RtnInfo {
	
	FAILED("500", "�o�Ϳ��~�A�ЦA����!"),
	SUCCESSFUL("200", "Successful"),
	PARAMETER_REQUIRED("400", "���n�ѼƯʥ��A�ЦA���աC"),
	DATA_REQUIRED("417", "�ж�g�����ơC");
//	ACCOUNT_REQUIRED("400", "Account cannot be null or empty!"),
//	PWD_REQUIRED("400", "Pwd is required!"),
//	NAME_REQUIRED("400", "Name is required!"),
//	ACCOUNT_EXISTED("403", "Account existed!"),
//	FAILURE("500", "Account is fail!"),
//	ADD_ROLE_FAILURE("500", "Add role fail!"),
//	ROLE_LIST_IS_EMPRY("400", "RoleList is empty!");
	
	private String code;
	private String message;
	
	private RtnInfo(String code, String message) {  //���غc��k�Φb�W��5-11
		this.code = code;                                //enum���غc��k�u��Oprivate
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
