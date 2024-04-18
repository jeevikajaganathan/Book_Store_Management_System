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

import Exceptions.AdminNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Admin;
import Spring_Project.Book_Store_Management_System.service.AdminService;


public class AdminController {
	@Autowired
	AdminService adminservice;
	
	@GetMapping
	public ResponseEntity<List<Admin>> getAdmin() throws AdminNotFoundException {
		List<Admin> admin = adminservice.getAdmin();
		return new ResponseEntity<List<Admin>>(admin, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Admin> getAdminId(@PathVariable("id") int id) throws AdminNotFoundException {
		Admin admin = adminservice.getAdminById(id);
		return new ResponseEntity<Admin>(admin, HttpStatus.OK);

	}
	@PostMapping
	public ResponseEntity<Admin> createAdmin() throws AdminNotFoundException {
		List<Admin> admin = adminservice.getAdmin();
		return new ResponseEntity<Admin>(HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Admin> updateAdminId(@PathVariable("id") int id) throws AdminNotFoundException  {
		Admin admin = adminservice.getAdminById(id);
		return new ResponseEntity<Admin>(admin, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteAdminId(@PathVariable("id") int id) throws AdminNotFoundException {
		Admin admin = adminservice.deleteAdmin(id);
		return HttpStatus.OK;
	}

}
