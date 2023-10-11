package com.example.newprojectt.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.newprojectt.model.PostsEntity;

import com.example.newprojectt.repository.PostsRepository;

@CrossOrigin("*")
@RestController
public class PostsController {
	@Autowired
	PostsRepository p1;
	@GetMapping("/getposts")
	public List<PostsEntity>getDetails(){
		return p1.findAll();
	}
	@PostMapping("/postposts")
	public String postdetails(@RequestBody PostsEntity p) {
		p1.save(p);
		return "details saved successfully";
	}
	@DeleteMapping("/deleteposts")
	public String deletedetails(@PathVariable("id") Long id) {
		p1.deleteById(id);
		return "deleted successfully";
	}
}

