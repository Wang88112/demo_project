package com.example.demo_project.vo;

import java.time.LocalDateTime;

public class ToDoReq {

	private String id;

	private String name;

	private boolean checked;
	
	private LocalDateTime createDate;
	
	private LocalDateTime updateDate;

	public ToDoReq() {

	}

	public ToDoReq(String id, String name, boolean checked, LocalDateTime createDate, LocalDateTime updateDate) {
		this.id = id;
		this.name = name;
		this.checked = checked;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	

}
