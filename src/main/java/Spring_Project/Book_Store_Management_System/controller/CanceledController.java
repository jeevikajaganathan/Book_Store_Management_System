package Spring_Project.Book_Store_Management_System.controller;

import java.awt.print.Book;
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

import Exceptions.AdminNotFoundException;
import Exceptions.BookNotFoundException;
import Exceptions.IdNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Canceled;
import Spring_Project.Book_Store_Management_System.service.BookService;
import Spring_Project.Book_Store_Management_System.service.CanceledService;

public class CanceledController {
	@Autowired
	
	CanceledService canceledservice;
	
	@GetMapping
	public ResponseEntity<List<Canceled>> getBook() throws  IdNotFoundException {
		List<Canceled> canceled = canceledservice.getCanceled();
		return new ResponseEntity<List<Canceled>>(canceled, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Canceled> getCanceledId(@PathVariable("id") int id) throws IdNotFoundException {
		Canceled canceled = canceledservice.getCanceledById(id);
		return new ResponseEntity<Canceled>(canceled, HttpStatus.OK);

	}
//	@GetMapping("/{title}")
//	public ResponseEntity<Canceled> getCanceledTitle(@PathVariable("title")String title)throws IdNotFoundException{
//		Canceled canceled = canceledservice.getBytitle(title);
//		return new ResponseEntity<Canceled>(canceled,HttpStatus.OK);
//	}
	@PostMapping
	public ResponseEntity<List<Canceled>> createCanceled() throws IdNotFoundException{
		List<Canceled> canceled = canceledservice.getCanceled();
		return new ResponseEntity<List<Canceled>>(canceled,HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Canceled> updateCanceledId(@PathVariable("id") int id) throws IdNotFoundException  {
		Canceled canceled = canceledservice.getCanceledById(id);
		return new ResponseEntity<Canceled>(canceled, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteCanceledId(@PathVariable("id") int id) throws IdNotFoundException {
		Canceled canceled = canceledservice.deleteCanceledById(id);
		return HttpStatus.OK;
	}
	}


