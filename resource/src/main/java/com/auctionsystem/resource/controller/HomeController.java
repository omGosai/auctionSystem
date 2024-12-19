package com.auctionsystem.resource.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<String> ControllerTest(){
        return new ResponseEntity<>("api end point test !", HttpStatus.OK);
    }
}
