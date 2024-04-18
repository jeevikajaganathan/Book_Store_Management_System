package Spring_Project.Book_Store_Management_System.repository;

import java.util.List;
import java.util.Optional;

import Spring_Project.Book_Store_Management_System.Model.Category;

public interface CategoryRepository {

	Optional<Category> findByTitle(String title);

	void deleteById(int id);

	List<Category> findAll();

	Optional<Category> findById(int id);

}
