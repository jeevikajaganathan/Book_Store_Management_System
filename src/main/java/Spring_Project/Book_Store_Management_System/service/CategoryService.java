package Spring_Project.Book_Store_Management_System.service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Exceptions.CategoryNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Category;
import Spring_Project.Book_Store_Management_System.repository.CategoryRepository;

public class CategoryService {
	@Autowired
         CategoryRepository categoryRepo;

	public List<Category> getCategory() throws CategoryNotFoundException {
		List<Category> ca = categoryRepo.findAll();
		if (ca.size() > 0) {
			return ca;
		} else {
			throw new CategoryNotFoundException("no record found");

		}

	}

	public Category getCategoryById(int id) throws CategoryNotFoundException {
		Optional<Category> c = categoryRepo.findById(id);
		if (c.isPresent()) {
			Category ca = c.get();
			return ca;
		} else {
			throw new CategoryNotFoundException("no record found");
		}

	}

	


	public Category updateCategory(int id) throws CategoryNotFoundException {
		Optional<Category> ca = categoryRepo.findById(id);
		if (ca.isPresent()) {

			Category c = ca.get();
			if (c.getCategoryname() != null) {
				c.setCategoryname(c.getCategoryName());
			}
			return c;
		}else {
			throw new CategoryNotFoundException("no record found");
			} 
	}

	public Category deleteCategory(int id) {
		categoryRepo.deleteById(id);
		return null;
	}

	

	public Category getBytitle(String title) throws CategoryNotFoundException {
		Optional<Category> ca = categoryRepo.findByTitle(title);
		if (ca.isPresent()) {
			Category c = ca.get();
			return c;
		} else {
			throw new CategoryNotFoundException("No Records Found");
		}
	}

}


