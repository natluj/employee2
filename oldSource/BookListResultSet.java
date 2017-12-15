//package employee.service;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.ResultSetExtractor;
//
//import employee.dao.BookDAO;
//import employee.model.Book;
//
//public class BookListResultSet implements ResultSetExtractor<List<Book>> {
//
//	public BookListResultSet(){
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public List<Book> extractData(ResultSet rs) throws SQLException, DataAccessException {
//		BookDAO bookDAO = new BookDAO();
//		return bookDAO.getBooks();
//	}
//
//}
