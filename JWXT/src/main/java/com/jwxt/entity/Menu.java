package com.jwxt.entity;

import java.io.Serializable;
import java.util.Date;

public class Menu implements Serializable{
	//陈柏霖
	private Integer menuId;
	private String menuName;
	private String menuUrl;
	private Integer menuType=1;
	private Integer sort;
	private String note;
	private Integer parentId;
	private String permission;
	private String createdUser;
	private String modifiedUser;
	private Date createdTime;
}
