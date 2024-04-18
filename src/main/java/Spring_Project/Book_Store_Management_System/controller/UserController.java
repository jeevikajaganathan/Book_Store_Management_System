package Spring_Project.Book_Store_Management_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import Exceptions.UsersNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Users;
import Spring_Project.Book_Store_Management_System.service.UserService;

public class UserController {
	@Autowired
	UserService userservice;
	
	@GetMapping
	public  ResponseEntity<List<Users>> getUser() throws UsersNotFoundException{
		List<Users> admin = userservice.getadmin();
		return new ResponseEntity<List<Users>>(admin,HttpStatus.OK);
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Users>getUserId(@PathVariable("id")int id)throws UsersNotFoundException {
		Users user =userservice.getuserId(id);
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<Users> createUser(@RequestBody Users user)throws UsersNotFoundException{
		Users users=userservice.createUser();
		return new ResponseEntity<Users>(users,HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Users>updateUserId(@PathVariable("id")int id)throws UsersNotFoundException {
		Users user = userservice.updateUserById(id);
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Users>deleteUserId1(@PathVariable("id")int id)throws UsersNotFoundException {
		Users user = userservice.deleteUserById(id);
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}

}



