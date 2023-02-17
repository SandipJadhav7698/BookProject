package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Bookdto;
import com.example.services.BookServices;

@RestController
public class BookController {
	@Autowired
	BookServices bookServices;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Bookdto bookdto){
		return bookServices.save(bookdto);
	}

}
