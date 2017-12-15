//package employee.dao;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Date;
//import java.util.List;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import employee.model.Book;
//import employee.service.BookMapper;
//
//@Repository
//@Transactional
//public class BookDAO {
//
//	private JdbcTemplate jdbcTemplate;
//
//	@Autowired
//	public void setDataSource(DataSource ds) {
//		this.jdbcTemplate = new JdbcTemplate(ds);
//	}
//
//	
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public int getNbRows() {
//		int rowCount = this.jdbcTemplate.queryForObject("select count(*) from book", Integer.class);
//		return rowCount;
//	}
//
//
//	public List<Book> getBooks() {
//		return this.jdbcTemplate.query( "select * from book", new BookMapper());
//	}
//	
//	public StringBuffer toString(Collection<Book> books) {
//		StringBuffer bookList = new StringBuffer();
//		String next = " ]\n";
//		for (Book book : books) {
//			bookList.append("[ " + book.getId() + ", " + book.getTitle() + ", " + book.getAuthor() + ", " + book.getNb_pages() + ", " + book.getPublication_date());
//			bookList.append(next);
//		}
//		return bookList;
//	}
//	
//	public void insertBook(Book b) {
//		this.jdbcTemplate.update("insert into book (title, author, nb_pages, publication_date) values (?, ?, ?, ?)",
//				b.getTitle(), 
//				b.getAuthor(), 
//				b.getNb_pages(), 
//				b.getPublication_date());
//		System.out.println("Un livre a été ajouté !");
//	}
//	
//	public void updateBookById(Integer id, Book b) {
//		this.jdbcTemplate.update("UPDATE book SET title=?, author=?, nb_pages=?, publication_date=? WHERE id="+id,
//				b.getTitle(), 
//				b.getAuthor(), 
//				b.getNb_pages(), 
//				b.getPublication_date());
//		System.out.println("Le livre n°" + id + " a été modifié !");
//	}
//
//	public void deleteBookById(Integer id) {
//		this.jdbcTemplate.update("DELETE FROM book WHERE id="+id);
//		System.out.println("Le livre n°" + id + " a été supprimé !");
//	}
//	
//	public void insertThreeRows() throws InterruptedException {
//		Book book1 = new Book(330, "La quête d Ewilan : ma bible", "Pierre B.", new Date());
//		Book book2 = new Book(330, "La quête d Ewilan : ma bible", "Pierre B.", new Date());
//		Book book3 = new Book(330, "La quête d Ewilan : ma bible", "Pierre B.", new Date());
//		insertBook(book1);
//		System.out.println("*********************************Sleeeeeeeeeeeep**********************************");
//		Thread.sleep(15_000); //sleep de 60s
//		insertBook(book2);
//		insertBook(book3);
//		System.out.println("Trois livres ont été ajoutés !");
//		
//	}
//	
//	public void insertBookWithSameId() {
//		Book book1 = new Book(380, "A la croisée des mondes", "Philip P.", new Date());
//		Book book2 = new Book(380, "A la croisée des mondes", "Philip P.", new Date());
//		Book book3 = new Book(380, "A la croisée des mondes", "Philip P.", new Date());
//		List<Book> liste = new ArrayList<>();
//		liste.add(book1);
//		liste.add(book2);
//		liste.add(book3);
//		for (Book b : liste) {
//			this.jdbcTemplate.update("insert into book (id, title, author, nb_pages, publication_date) values (16, ?, ?, ?, ?);",
//					b.getTitle(), 
//					b.getAuthor(), 
//					b.getNb_pages(), 
//					b.getPublication_date());
//			System.out.println("Un livre a été ajouté !");
//		}
//	}
//}
