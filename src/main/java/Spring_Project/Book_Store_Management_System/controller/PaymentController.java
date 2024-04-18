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

import Exceptions.PaymentNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Payment;
import Spring_Project.Book_Store_Management_System.service.PaymentService;

public class PaymentController {
	@Autowired
	PaymentService paymentservice;

	@GetMapping
	public ResponseEntity<List<Payment>> getPayment() throws PaymentNotFoundException {
		List<Payment> payment = paymentservice.getPayment();
		return new ResponseEntity<List<Payment>>(payment, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Payment> getPaymentId(@PathVariable("id") int id) throws PaymentNotFoundException {
		Payment payment = paymentservice.getPaymentById(id);
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<List<Payment>> getPayment1() throws PaymentNotFoundException {
		List<Payment> payment = paymentservice.getPayment();
		return new ResponseEntity<List<Payment>>(payment, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Payment> updatePaymentId(@PathVariable("id") int id) throws PaymentNotFoundException {
		Payment payment = paymentservice.getPaymentById(id);
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Payment> deletePaymentId(@PathVariable("id") int id) throws PaymentNotFoundException {
		Payment payment = paymentservice.getPaymentById(id);
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
	}

}
