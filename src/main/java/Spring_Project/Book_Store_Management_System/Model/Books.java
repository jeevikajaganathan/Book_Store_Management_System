package Spring_Project.Book_Store_Management_System.Model;

public class Books {
	private int Id;
	private String title;
	private double price;
	
	private Author author;
	private Category category;
	
	public Books(int Id, String title, double price) {
	this.Id = Id;
	this.title = title;
	this.price = price;
	
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
