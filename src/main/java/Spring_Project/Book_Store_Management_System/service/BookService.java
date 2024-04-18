package Spring_Project.Book_Store_Management_System.service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Exceptions.BookNotFoundException;
import Spring_Project.Book_Store_Management_System.repository.BookRepository;

@Service
public class BookService {
	
	
			@Autowired
			BookRepository bookRepo;

			public List<Book> getBook() throws BookNotFoundException {
				List<Book> bk = bookRepo.findAll();
				if (bk.size() > 0) {
					return bk;
				} else {
					throw new BookNotFoundException("no record found");

				}

			}

			public Book getBookById(int id) throws BookNotFoundException {
				Optional<Book> b = bookRepo.findById(id);
				if (b.isPresent()) {
					Book bk = b.get();
					return bk;
				} else {
					throw new BookNotFoundException("no record found");
				}

			}



			public Book updateBook(int id) throws BookNotFoundException {
				Optional<Book> bk = bookRepo.findById(id);
				if (bk.isPresent()) {

					Book b = bk.get();
					if (b.getBookname() != null) {
						b.setBookname(b.getBookname());
					}
	                 bookRepo.save(b);
					return b;
				}else {
					throw new BookNotFoundException("no record found");
					} 
			}

			public Book deleteBook(int id) {
				bookRepo.deleteById(id);
				return null;
			}

			

			public Book getBytitle(String title) throws BookNotFoundException {
				Optional<Book> bk = bookRepo.findByTitle(title);
				if (bk.isPresent()) {
					Book b = bk.get();
					return b;
				} else {
					throw new BookNotFoundException("No Records Found");
				}
			}

	}
