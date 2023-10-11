package com.example.newprojectt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usertable")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String userimg;
	private String username;
	private String name;
	private String bio;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserimg() {
		return userimg;
	}
	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public UserEntity(int userid, String userimg, String username, String name, String bio) {
		super();
		this.userid = userid;
		this.userimg = userimg;
		this.username = username;
		this.name = name;
		this.bio = bio;
	}
	public UserEntity() {
		
	}
}

