package Spring_Project.Book_Store_Management_System.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import Exceptions.AuthorNotFoundException;
import Exceptions.BookNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Author;
import Spring_Project.Book_Store_Management_System.service.BookService;

public class BookController {
	@Autowired
	
	BookService bookservice;
	
	@GetMapping
	public ResponseEntity<List<Book>> getBook() throws BookNotFoundException {
		List<Book> book = bookservice.getBook();
		return new ResponseEntity<List<Book>>(book, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookId(@PathVariable("id")int id)throws BookNotFoundException{
		Book book = bookservice.getBookById(id);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	@GetMapping("/{title}")
	public ResponseEntity<Book> getBookTitle(@PathVariable("title")String title)throws BookNotFoundException{
		Book book = bookservice.getBytitle(title);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<List<Book>> createBook() throws BookNotFoundException{
		List<Book> book = bookservice.getBook();
		return new ResponseEntity<List<Book>>(book,HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Book> updateBookId(@PathVariable("id")int id) throws BookNotFoundException{
		Book book = bookservice.updateBook(id);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public HttpStatus deleteBookId(@PathVariable("id") int id)throws BookNotFoundException {
		Book book = bookservice.deleteBook(id);
		return HttpStatus.OK;
	}
	}


