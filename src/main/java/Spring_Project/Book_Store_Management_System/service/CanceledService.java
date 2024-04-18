package Spring_Project.Book_Store_Management_System.service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Exceptions.IdNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Author;
import Spring_Project.Book_Store_Management_System.Model.Canceled;
import Spring_Project.Book_Store_Management_System.repository.CanceledRepository;

@Service
public class CanceledService {
	@Autowired
	CanceledRepository canceledRepo;

	public List<Canceled> getCanceled() throws IdNotFoundException {
		List<Canceled> cn = canceledRepo.findAll();
		if (cn.size() > 0) {
			return cn;
		} else {
			throw new IdNotFoundException("no record found");

		}

	}
	public Canceled getCanceledById(int id) throws IdNotFoundException {
		Optional<Canceled> c = canceledRepo.findById(id);
		if (c.isPresent()) {
			Canceled cn = c.get();
			return cn;
		} else {
			throw new IdNotFoundException("no record found");
		}

	}
	public Canceled deleteCanceledById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
