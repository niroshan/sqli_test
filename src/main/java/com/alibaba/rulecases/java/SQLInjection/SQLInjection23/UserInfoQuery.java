package com.alibaba.rulecases.java.SQLInjection.SQLInjection23;

import java.util.Date;

public class UserInfoQuery  {
	private String orderBy ;

	private Date gmtCreate;

	private Long id;

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
