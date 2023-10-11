package com.example.newprojectt.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

    @Entity
    @Table(name="entries")
//    @Data

   	public class AppEntity {
    	@Id
    	@GeneratedValue(strategy = GenerationType.IDENTITY)
    	@Column(name="id")
    	private Long id;
    	@Column(name="email")
    	private String email;
    	@Column(name="mobile")
    	private String mobile;
    	@Column(name="password")
    	private String password;
    	@Column(name="username")
    	private String username;
    	public AppEntity() {
    		super();
    	}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public AppEntity(Long id, String email, String mobile, String password, String username) {
			super();
			this.id = id;
			this.email = email;
			this.mobile = mobile;
			this.password = password;
			this.username = username;
		}
    	
   
	}

