package employee.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@AfterReturning(pointcut="execution(* employee.controller.BookController.get*(..))", returning="returnValue")
	public void logSummonAfter(Object returnValue) {
		System.out.println("log."+returnValue);
	}
	
	
	@Before("execution(public * *(..))")
	public void logSummonBefore(JoinPoint jp) {
		System.out.println("*********** roulements de tambour ************");
		System.out.println(jp.getSignature());
	}
	
	@AfterThrowing(pointcut="execution(public * delete*(..))", throwing="ex")
	public void logSummonException(IndexOutOfBoundsException ex) {
		System.out.println("VOUS NE PASSEREZ PAAAAAAAAAAAAAAS");
	}
	
	@Around("execution(* employee.controller.BookController.save(..))")
	public void logSummonAround(ProceedingJoinPoint jp) throws Throwable {
		Long t0 = System.nanoTime();
		Object retVal = jp.proceed();
		Long t1 = System.nanoTime();
		System.out.println("N'éteignez pas...");
		System.out.println(retVal + " en " + t1 + "-" + t0 + "nanosecondes");
	}
	

}
