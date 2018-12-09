package firstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjection {

	public static void main(String[] args) {
		ApplicationContext cxt= new ClassPathXmlApplicationContext("Spring.xml");
		A a =(A) cxt.getBean("a");
		System.out.println(a.hashCode());
		System.out.println(a.getB().hashCode());
		System.out.println(a.toString());
		a.setName("Bhaskar");
		a.getB().setAge("42");
		A a1 =(A) cxt.getBean("a");
		System.out.println(a1.hashCode());
		System.out.println(a.getB().hashCode());
		System.out.println(a1.toString());
	}

}
