package com.book.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.Service.WarddetailsService;
import com.book.model.Warddetails;
import com.fasterxml.jackson.core.JsonProcessingException;

@CrossOrigin
@RestController
public class WarddetailsController {
	@Autowired
WarddetailsService userService;
	
	@PostMapping("/api/post")
	public ResponseEntity<Warddetails> create(final @RequestBody Warddetails users){
		Warddetails createUser=userService.create(users);
		return ResponseEntity.ok(createUser);
	}
	
	@GetMapping("/")
	public List<Warddetails> getallProducts(){
		return userService.getAllProducts();
	}
	@GetMapping("/user/{id}")
	public ResponseEntity<Optional<Warddetails>> read(final @PathVariable Long id){
		Optional<Warddetails> createdCandidate=userService.read(id);
		return ResponseEntity.ok(createdCandidate);
	}
	@PutMapping("/put/{id}")
	 ResponseEntity<Warddetails> update(final @RequestBody Warddetails user)throws  JsonProcessingException{
		final Warddetails updatedUser=userService.update(user);
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(final @PathVariable Long id) {
		userService.delete(id);
	}
}