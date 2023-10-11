package com.example.newprojectt.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.newprojectt.model.UserEntity;
import com.example.newprojectt.repository.NewUserRepository;
@CrossOrigin("*")
 @RestController
public class UserController {
	@Autowired
	NewUserRepository u1;
	@GetMapping("/getuser")
	public List<UserEntity>getDetails(){
		return u1.findAll();
	}
	@PostMapping("/postuser")
	public String postdetails(@RequestBody UserEntity u) {
		u1.save(u);
		return "details saved successfully";
	}
	@DeleteMapping("/deleteuser")
	public String deletedetails(@PathVariable("id") Long id) {
		u1.deleteById(id);
		return "deleted successfully";
	}
	@PutMapping("/updateusers")
	public UserEntity putDetails(@PathVariable Long id,@RequestBody UserEntity entity) {
		UserEntity existinguserentity =u1.findById(id).orElse(null);
		existinguserentity.setUserimg(entity.getUserimg());
		existinguserentity.setUsername(entity.getUsername());
		existinguserentity.setName(entity.getName());
		existinguserentity.setBio(entity.getBio());
		return u1.save(existinguserentity);
	}
}
