package com.jwxt.entity;

import java.io.Serializable;
import java.util.Date;

public class RoleEntity implements Serializable {
	private static final long serialVersionUID = 3435467728500278706L;
	private Integer id;
	private String name;
	private Date gmt_creat;
	private Date gmt_modified;
	private String ceate_user;
	private String modified_user;
	private Integer role_state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getGmt_creat() {
		return gmt_creat;
	}
	public void setGmt_creat(Date gmt_creat) {
		this.gmt_creat = gmt_creat;
	}
	public Date getGmt_modified() {
		return gmt_modified;
	}
	public void setGmt_modified(Date gmt_modified) {
		this.gmt_modified = gmt_modified;
	}
	public String getCeate_user() {
		return ceate_user;
	}
	public void setCeate_user(String ceate_user) {
		this.ceate_user = ceate_user;
	}
	public String getModified_user() {
		return modified_user;
	}
	public void setModified_user(String modified_user) {
		this.modified_user = modified_user;
	}
	public Integer getRole_state() {
		return role_state;
	}
	public void setRole_state(Integer role_state) {
		this.role_state = role_state;
	}
}
