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

import Exceptions.CategoryNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Category;
import Spring_Project.Book_Store_Management_System.service.CategoryService;

public class CategoryController {
	@Autowired
	CategoryService categoryservice;
	
	@GetMapping
	public ResponseEntity<List<Category>> getCategory() throws CategoryNotFoundException {
		List<Category> category = categoryservice.getCategory();
		return new ResponseEntity<List<Category>>(category, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategoryId(@PathVariable("id") int id) throws CategoryNotFoundException {
		Category category = categoryservice.getCategoryById(id);
		return new ResponseEntity<Category>(category, HttpStatus.OK);

	}
	@PostMapping
	public ResponseEntity<List<Category>> crateCategory() throws CategoryNotFoundException{
		List<Category>category=categoryservice.getCategory();
		return new ResponseEntity<List<Category>>(category,HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Category>updateCategoryId(@PathVariable("id")int id) throws CategoryNotFoundException{
		Category category = categoryservice.getCategoryById(id);
		return new ResponseEntity<Category>(category,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Category>deleteCategoryId(@PathVariable("id")int id) throws CategoryNotFoundException{
		Category category = categoryservice.getCategoryById(id);
		return new ResponseEntity<Category>(category,HttpStatus.OK);
	}

}
