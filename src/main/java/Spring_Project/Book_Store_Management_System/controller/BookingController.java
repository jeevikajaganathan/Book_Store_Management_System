package Spring_Project.Book_Store_Management_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Exceptions.BookingNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Booking;
import Spring_Project.Book_Store_Management_System.service.BookingService;

public class BookingController {
	
	@Autowired
	BookingService bookingservice;

	@GetMapping
	public ResponseEntity<List<Booking>> getBoooking() throws BookingNotFoundException {
		List<Booking> booking = bookingservice.getBooking();
		return new ResponseEntity<List<Booking>>(booking, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Booking> getAuthorId(@PathVariable("id") int id) throws BookingNotFoundException {
		Booking booking = bookingservice.getBookingById(id);
		return new ResponseEntity<Booking>(booking, HttpStatus.OK);

	}
	@GetMapping("/{name}")
	public ResponseEntity<Booking>getBookingName(@PathVariable("name")String name) throws BookingNotFoundException {
		Booking booking = bookingservice.getByname(name);
		return new ResponseEntity<Booking>(booking,HttpStatus.OK);
		
	}

	@PostMapping
	public ResponseEntity<List<Booking>> createBooking() throws BookingNotFoundException {
		List<Booking> booking = bookingservice.getBooking();
		return new ResponseEntity<List<Booking>>(booking, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Booking> updateBookingId(@PathVariable("id") int id,@RequestBody Booking booking) throws BookingNotFoundException  {
		Booking bookings = bookingservice.updateBooking(id,booking);
		return new ResponseEntity<Booking>(bookings, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteBookingId(@PathVariable("id") int id) throws BookingNotFoundException {
		Booking booking = bookingservice.deleteBooking(id);
		return HttpStatus.OK; 
	}
}
