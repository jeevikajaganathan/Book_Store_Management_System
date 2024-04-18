package Spring_Project.Book_Store_Management_System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Exceptions.PaymentNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Payment;
import Spring_Project.Book_Store_Management_System.repository.PaymentRepository;

public class PaymentService {
	@Autowired
	PaymentRepository paymentrepo;
	
	public List<Payment> getPayment() throws PaymentNotFoundException {
		List<Payment> pay = paymentrepo.findAll();
		if (pay.size() > 0) {
			return pay;
		} else {
			throw new PaymentNotFoundException("no record found");

		}

	}
	public Payment getPaymentById(int id) throws PaymentNotFoundException {
		Optional<Payment> a = paymentrepo.findById(id);
		if (a.isPresent()) {
			Payment pay = a.get();
			return pay;
		} else {
			throw new PaymentNotFoundException("no record found");
		}

	}
	public Payment deletePayment(int id) {
		paymentrepo.deleteById(id);
		return null;
	}
}
