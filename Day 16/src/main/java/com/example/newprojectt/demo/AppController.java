package com.example.newprojectt.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.newprojectt.model.AppEntity;
import com.example.newprojectt.repository.AppRepository;

@RestController
	public class AppController {
		
		@Autowired
		AppRepository f1;
		
		@GetMapping("/getdetail") 
		public List<AppEntity> getdetails(){
			return f1.findAll();
		}
		
		@DeleteMapping("/deletedetail/{id}")
		public String delete (@PathVariable("id") Long id) {
			f1.deleteById(id);
			return "deleted successfully";
		}
		
		@PostMapping("/postdetail")
		public String postDetails(@RequestBody AppEntity obj) {
			f1.save(obj);
		    return "posted successfully";
		}
		
		
		@PutMapping("/update")
		public AppEntity putDetails(@PathVariable Long id,@RequestBody AppEntity entity) {
			AppEntity existingentity =f1.findById(id).orElse(null);
			existingentity.setUsername(entity.getUsername());
			existingentity.setEmail(entity.getEmail());
			existingentity.setPassword(entity.getPassword());
			existingentity.setMobile(entity.getMobile());
			return f1.save(existingentity);
		}
	}

