//package employee.service;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowCallbackHandler;
//
//import employee.dao.BookDAO;
//import employee.model.Book;
//
//public class BookRowCallBackHandler implements RowCallbackHandler {
//
//	private List<Book> booksHandler;
//	private JdbcTemplate jdbcTemplate;
//
//	public BookRowCallBackHandler() {
//		booksHandler = new ArrayList<Book>();
//	}
//
//	public void getAllBooks(BookDAO bookDAO) throws SQLException {
//		booksHandler = bookDAO.getBooks();
//
//		/*
//		 * BookMapper bkmap = new BookMapper();
//		 * books.addAll(bkmap.extractBookFromRs(rs));
//		 */
//	}
//
//	public List<String> getAllAuthors(List<Book> bookHandler) {
//		List<String> authors = new ArrayList<String>();
//		for (Book book : bookHandler) {
//			if (!authors.contains(book.author)) {
//				authors.add(book.author);
//			}
//		}
//		return authors;
//	}
//
//	public List<Book> filterByAuthor(List<Book> bookHandler, List<String> authors) {
//		List<String> authorsByName = authors.stream().sorted().collect(Collectors.toList());
//		List<Book> bookHandlerByAuthor = new ArrayList<Book>();
//		for (String author : authorsByName) {
//			for (Book book : bookHandler) {
//				if (book.author.equals(author)) {
//					if (!bookHandlerByAuthor.contains(book)) {
//						bookHandlerByAuthor.add(book);
//					}
//				}
//			}
//		}
//		return bookHandlerByAuthor;
//	}
//
//	public Map<String, List<Book>> mappageBook(List<Book> bookHandler, List<String> authors) {
//		Map<String, List<Book>> authorBooks = new HashMap<String, List<Book>>();
//		for (String author : authors) {
//			List<Book> books = new ArrayList<Book>();
//			for (Book book : bookHandler) {
//				if (book.author.equals(author)) {
//					books.add(book);
//				}
//			}
//			authorBooks.put(author, books);
//		}
//		return authorBooks;
//	}
//
//	public List<Book> getBooksHandler() {
//		return booksHandler;
//	}
//
//	@Override
//	public void processRow(ResultSet arg0) throws SQLException {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Autowired
//	public void setDataSource(DataSource ds) {
//		this.jdbcTemplate = new JdbcTemplate(ds);
//	}
//
//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//}
