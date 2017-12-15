package employee;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import employee.dao.BookRepository;
import employee.model.Book;

public class Run {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		BookRepository repo = context.getBean(BookRepository.class);

//		passage à jpa
//		Book b1 = new Book(460, "L'histoire de la vie", "sir Caleb Joseph", new Date()); //add
//		repo.add(b1);
		Book bb = new Book(460, "L'histoire de la vie", "sir Caleb JOSEPH", new Date()); //update
		bb.setId(1);
		repo.update(bb);
//		List<Book> library = repo.getAll(); //getAll
//		System.out.println(Book.toString(library));
//		Book b2 = repo.getById(1); //getById
//		System.out.println(b2.getTitle());
		
		
		
		context.close();
	}

}
