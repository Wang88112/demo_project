package com.example.demo_project.constants;

public enum RegisterRtnCode {   

	SUCCESSFUL("200", "Successful"),
	ACCOUNT_REQUIRED("400", "Account cannot be null or empty!"),
	PWD_REQUIRED("400", "Pwd is required!"),
	NAME_REQUIRED("400", "Name is required!"),
	ACCOUNT_EXISTED("403", "Account existed!"),
	FAILURE("500", "Account is fail!"),
	ADD_ROLE_FAILURE("500", "Add role fail!"),
	ROLE_LIST_IS_EMPRY("400", "RoleList is empty!");
	
	private String code;
	private String message;
	
	private RegisterRtnCode(String code, String message) {  //此建構方法用在上面5-11
		this.code = code;                                //enum的建構方法只能是private
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	
	
}
