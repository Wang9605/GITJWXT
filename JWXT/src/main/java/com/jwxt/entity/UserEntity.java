package com.jwxt.entity;

public class UserEntity extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6062140534627256318L;
	private Integer id;
	private String username;
	private String gender;
	private String password;
	private String salt;
	private String email;
	private String mobile;
	private Integer role_state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getRole_state() {
		return role_state;
	}
	public void setRole_state(Integer role_state) {
		this.role_state = role_state;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
