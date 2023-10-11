package com.example.newprojectt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="postdetails")
public class PostsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String img;
//	private String Likes;
	private String caption;
//	private String userimage;
//	private String username;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
//	public String getLikes() {
//		return Likes;
//	}
//	public void setLikes(String likes) {
//		Likes = likes;
//	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public PostsEntity(Long id, String img, String caption) {
		super();
		this.id = id;
		this.img = img;
//		Likes = likes;
		this.caption = caption;
	}
	
	public PostsEntity() {
		
	}
}

