package com.sukhveer.taxibooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sukhveer.taxibooking.entity.BookCab;
import com.sukhveer.taxibooking.service.BookCabService;

@RestController
//@RequestMapping("/taxi")
public class BookCabController {
	
	@Autowired
	private BookCabService bookCabService;
	
	//http://localhost:8084/taxi/bookcab
	//Build create BookCab Rest api
	//insert BookCab handler
	@PostMapping("/bookcab")
	public ResponseEntity<BookCab> saveBookCab(@RequestBody BookCab bookCab){
		return new ResponseEntity<BookCab>(bookCabService.saveBooking(bookCab),HttpStatus.CREATED);
	}
	
	//get all BookCab Handler
	@GetMapping("/list-of-bookcab")
	public BookCab getAllBookCab(){
		return bookCabService.getAllBookCab();
	}
	
	@GetMapping("/bookcab/{id}")
	public ResponseEntity<BookCab> getBookCabById(@RequestParam long bookId){
		return new ResponseEntity<BookCab>(bookCabService.getBookCabById(bookId),HttpStatus.OK);
	}
	
	
}









