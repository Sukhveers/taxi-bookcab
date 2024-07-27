package com.sukhveer.taxibooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sukhveer.taxibooking.dao.BookCabRepository;
import com.sukhveer.taxibooking.entity.BookCab;
import com.sukhveer.taxibooking.exception.ResourceNotFoundException;
import com.sukhveer.taxibooking.service.BookCabService;

@Service
public class BookCabServiceImpl implements BookCabService{
	
	@Autowired
	private BookCabRepository bookCabRepository;

	@Override
	public BookCab saveBooking(BookCab bookCab) {
		// TODO Auto-generated method stub
		return bookCabRepository.save(bookCab);
	}

	
	@Override
	public BookCab getAllBookCab() {
		// TODO Auto-generated method stub	
		BookCab bookCab=new BookCab();
		bookCab.setId(bookCab.getId());
		bookCab.setOrigin(bookCab.getOrigin());
		bookCab.setDestination(bookCab.getDestination());
		bookCab.setPickupDate(bookCab.getPickupDate());
		bookCab.setPickupTime(bookCab.getPickupTime());
		return bookCab;
	}

	@Override
	public BookCab getBookCabById(long id) {
		// TODO Auto-generated method stub
		/*
		 * Optional<BookCab> bookCab=bookCabRepository.findById(id);
		 * if(bookCab.isPresent()) { return bookCab.get(); } else { throw new
		 * ResourceNotFoundException("BookCab", "id",id); }
		 */
		return bookCabRepository.findById(id).orElseThrow(() -> 
		           new ResourceNotFoundException("BookCab", "id",id)); 

	}


	

}
