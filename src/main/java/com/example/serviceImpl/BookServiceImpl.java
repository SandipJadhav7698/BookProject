package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.dao.BookRepository;
import com.example.dto.Bookdto;
import com.example.model.Book;
import com.example.services.BookServices;
@Service
public class BookServiceImpl implements BookServices{
@Autowired
BookRepository bookRepository;

@Override
public ResponseEntity<String> save(Bookdto bookdto) {
	Book book=new Book();
	book.setBookName(bookdto.getBookName());
	bookRepository.save(book);
	return new ResponseEntity<>("Book Save SucessFully",HttpStatus.OK);
}
}
