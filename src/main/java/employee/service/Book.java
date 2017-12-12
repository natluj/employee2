package employee.service;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book {

	@SequenceGenerator(name="seq", initialValue=9)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	Integer id;
	
	Integer nb_pages;
	String title, author;
	Date publication_date;
	
	
	@Autowired
	static DataSource ds;

	public void doTheJob(String job) {
		System.out.println(job);
	}

	public Book() {
		System.out.println("BLAAAAAAAAH");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNb_pages() {
		return nb_pages;
	}

	public void setNb_pages(int nb_pages) {
		this.nb_pages = nb_pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	public static DataSource getDs() {
		return ds;
	}

	public static void setDs(DataSource ds) {
		Book.ds = ds;
	}

	public Book(Integer nb_pages, String title, String author, Date publication_date) {
		super();
		this.nb_pages = nb_pages;
		this.title = title;
		this.author = author;
		this.publication_date = publication_date;
	}
	

}
