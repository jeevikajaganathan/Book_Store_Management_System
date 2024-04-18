package Spring_Project.Book_Store_Management_System.controller;

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
import Spring_Project.Book_Store_Management_System.Model.Author;
import Spring_Project.Book_Store_Management_System.service.AuthorService;

public class AuthorController {
	@Autowired
	AuthorService authorservice;

	@GetMapping
	public ResponseEntity<List<Author>> getAuthor() throws AuthorNotFoundException {
		List<Author> author = authorservice.getAuthor();
		return new ResponseEntity<List<Author>>(author, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Author> getAuthorId(@PathVariable("id") int id) throws AuthorNotFoundException {
		Author author = authorservice.getAuthorById(id);
		return new ResponseEntity<Author>(author, HttpStatus.OK);

	}
	@GetMapping("/{name}")
	public ResponseEntity<Author>getAuthorName(@PathVariable("name")String name) throws AuthorNotFoundException {
		Author author = authorservice.getByname(name);
		return new ResponseEntity<Author>(author,HttpStatus.OK);
		
	}

	@PostMapping
	public ResponseEntity<List<Author>> createAuthor() throws AuthorNotFoundException {
		List<Author> author = authorservice.getAuthor();
		return new ResponseEntity<List<Author>>(author, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Author> updateAuthorId(@PathVariable("id") int id) throws AuthorNotFoundException  {
		Author author = authorservice.updateAuthor(id);
		return new ResponseEntity<Author>(author, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteAuthorId(@PathVariable("id") int id) throws AuthorNotFoundException {
		Author author = authorservice.deleteAuthor(id);
		return HttpStatus.OK;
	}
}
