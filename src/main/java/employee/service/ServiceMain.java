package employee.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import employee.App;
import employee.dao.BookDAO;

public class ServiceMain {

	public static void main(String[] args) throws InterruptedException {
//		AOP
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		/*BookController bookController = context.getBean(BookController.class);
		bookController.doTheJob("Yahhooooooooooo !");
		bookController.getTruc();
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		
//		bookController.deleteAtIndex3(list);
		
		bookController.save();*/

		
		
//		Spring : bonecp
//			
			BookDAO bookDAO = context.getBean(BookDAO.class);
			System.out.println("Nombre de lignes : " + bookDAO.getNbRows());
			
			System.out.println(bookDAO.toString(bookDAO.getBooks()));
			
//			Book book = new Book(280, "A comme Association", "Pierre B. et Erik l H.", new Date());
//			bookDAO.insertBook(book);
//			bookDAO.updateBookById(4, book);
//			bookDAO.deleteBookById(4);
			
			bookDAO.insertThreeRows();  //pour montrer l'isolation des transactions 
//			bookDAO.insertBookWithSameId(); //pour montrer l'atomicité des transactions
			
		context.close();
	}
	
}
