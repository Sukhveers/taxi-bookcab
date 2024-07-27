package com.sukhveer.taxibooking.service;

import java.util.List;

import com.sukhveer.taxibooking.entity.BookCab;

public interface BookCabService {
	BookCab saveBooking(BookCab bookCab);
	BookCab getAllBookCab();
	BookCab getBookCabById(long id);
	

}
