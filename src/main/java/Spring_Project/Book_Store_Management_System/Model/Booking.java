package Spring_Project.Book_Store_Management_System.Model;
import java.util.Date;
public class Booking {
	private int id;
	private Date Date;
	private String Title;
	
	
	public Booking(int id, java.util.Date date, String title) {
		super();
		this.id = id;
		Date = date;
		Title = title;
	}
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	
	

}
