package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookservices")
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
//@GeneratedValue(strategy = GenerationType.AUTO);
private Long bookid;
private String bookName;
public Long getBookid() {
	return bookid;
}
public void setBookid(Long bookid) {
	this.bookid = bookid;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}


}
