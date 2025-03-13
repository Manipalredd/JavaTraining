package com.example.demo.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;
 
@RestController
@RequestMapping(value = "/employ")
public class EmployController {
 
	
	@Autowired
	private EmployRepository employRepository;
	
	@GetMapping(value = "/showEmploy")
	public List<Employ> showEmploy(){
		return employRepository.findAll();
	}
	
	
	@GetMapping("/searchEmploy/{id}")
	public ResponseEntity<Employ> getTutorialById(@PathVariable int id){
		Employ employ=employRepository.findById(id)
		.orElseThrow(()->new ResourceNotFoundException("Not found employ with id ="+id));
		return new ResponseEntity<>(employ,HttpStatus.OK);
	}
	
}