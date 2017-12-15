//package employee.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//import employee.model.Book;
//
//@Controller
//public class BookController {
//
//	@Autowired
//	Book myService;
//	
//
//	public BookController() {
//		super();
//	}
//	
//	public void doTheJob(String job) {
//		myService.doTheJob("controller " + job);
//	}
//	
//	public StringBuffer getTruc() {
//		StringBuffer truc = new StringBuffer();
//		truc.append("Haha");
//		return truc;
//	}
//
//	public List<Integer> deleteAtIndex3(List<Integer> list) throws IndexOutOfBoundsException {
//		list.remove(3);
//		return list;
//	}
//	
//	public StringBuffer save() {
//		StringBuffer strb = new StringBuffer();
//		strb.append("La partie a été sauvegardée.");
//		return strb;
//	}
//}
