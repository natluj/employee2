package employee.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="book")
public class Book {

	@Id
	@SequenceGenerator(name = "book_id_seq", sequenceName="book_id_seq", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
	Integer id;

	@Column(name = "nbPages")
	Integer nbPages;

	@Column(name = "title")
	String title;

	@Column(name = "author")
	String author;

	@Temporal(TemporalType.DATE)
	@Column(name = "publicationDate")
	Date publicationDate;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nb_pages) {
		this.nbPages = nb_pages;
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

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publication_date) {
		this.publicationDate = publication_date;
	}

	public Book(Integer nb_pages, String title, String author, Date publication_date) {
		super();
		this.nbPages = nb_pages;
		this.title = title;
		this.author = author;
		this.publicationDate = publication_date;
	}
	
	public Book() {
		
	}

	public static StringBuffer toString(Collection<Book> books) {
		StringBuffer bookList = new StringBuffer();
		String next = " ]\n";
		for (Book book : books) {
			bookList.append("[ " + book.getId() + ", " + book.getTitle() + ", " + book.getAuthor() + ", "
					+ book.getNbPages() + ", " + book.getPublicationDate());
			bookList.append(next);
		}
		return bookList;
	}

}
