package Spring_Project.Book_Store_Management_System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Exceptions.AuthorNotFoundException;
import Exceptions.BookingNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Booking;
import Spring_Project.Book_Store_Management_System.repository.BookingRepository;


@Service
public class BookingService {
	@Autowired
	BookingRepository bookingRepo;

	public List<Booking> getBooking() throws BookingNotFoundException {
		List<Booking> bo = bookingRepo.findAll();
		if (bo.size() > 0) {
			return bo;
		} else {
			throw new BookingNotFoundException("no record found");

		}

	}
	public Booking getBookingById(int id) throws BookingNotFoundException {
		Optional<Booking> b = bookingRepo.findById(id);
		if (b.isPresent()) {
			Booking bo = b.get();
			return bo;
		} else {
			throw new BookingNotFoundException("no record found");
		}

	}
	public Booking updateBooking(int id ,Booking booking) throws BookingNotFoundException {
		Optional<Booking> bo = bookingRepo.findById(booking.getId());
		if (bo.isPresent()) {

			Booking b = bo.get();
			if (booking.getTitle() != null) {
				b.setTitle(booking.getTitle());
			}
			if(booking.getDate()!=null) {
				b.setDate(booking.getDate());
			}
			
             bookingRepo.save(b);
			return b;
		}else {
			throw new BookingNotFoundException("no record found");
			} 
	}
	public Booking getByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	public Booking deleteBooking(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
