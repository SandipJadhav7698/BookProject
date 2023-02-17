package com.example.services;

import org.springframework.http.ResponseEntity;

import com.example.dto.Bookdto;

public interface BookServices {

	ResponseEntity<String> save(Bookdto bookdto);

}
