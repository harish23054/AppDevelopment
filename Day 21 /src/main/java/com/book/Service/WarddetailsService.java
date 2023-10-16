package com.book.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Warddetails;
import com.book.repository.WarddetailsRepo;

@Service
public class WarddetailsService {
	@Autowired
  	WarddetailsRepo userRepository;
  	public Warddetails create(Warddetails users) {
  		return userRepository.save(users);
  	}
  	public List<Warddetails> getAllProducts(){
  		return userRepository.findAll();
  	}
  	public Warddetails update(Warddetails users) {
  		return userRepository.save(users);
  		
  	}
  	public void delete(Long Id) {
  		userRepository.deleteById(Id);
  	}
  	public Optional<Warddetails> read(Long id){
  		return userRepository.findById(id);
  	}
  	
}