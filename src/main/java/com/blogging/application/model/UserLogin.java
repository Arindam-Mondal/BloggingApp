package com.blogging.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blog_user_login")
public class UserLogin {
	
	@Id
	@Column(name="blog_userid")
	private String userid;
	@Column(name="blog_password")
	private String password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserLogin [userid=" + userid + ", password=" + password + "]";
	}
	
	
}
