package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.DontShowMe;
import com.example.demo.Model.Employee;
import com.example.demo.Service.MyService;

@RestController
@RequestMapping
public class MyController {
	
	@Autowired
	private MyService service;
	
	
	@PostMapping("/insert")
	public ResponseEntity<DontShowMe> addEmp( @RequestBody Employee emp){
		Employee add = service.add(emp);
		DontShowMe dontShowMe = new DontShowMe();
		dontShowMe.setError(false);
		dontShowMe.setData(add);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/fetch")
	public Employee getEmp(@RequestParam int id) {
	return	service.res(id);
		
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam int id){
		service.remove(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<?>updateAll(@RequestBody Employee emp){
		service.replace(emp);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
