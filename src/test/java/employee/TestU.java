package employee;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestU {

	@Test
	public void test() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		
		
		context.close();
	}

}
