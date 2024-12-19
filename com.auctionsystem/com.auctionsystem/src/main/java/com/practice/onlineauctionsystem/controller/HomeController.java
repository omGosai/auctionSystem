package com.practice.onlineauctionsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public ResponseEntity<String> homeapi(){
		return new ResponseEntity<String>("End point test !",HttpStatus.OK);
	}

}
