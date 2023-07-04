package in.demo.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("in/demo/ci/Config.xml");
		
		Student s1=context.getBean("st1", Student.class);
		
		System.out.println(s1);
		
		
	}

}
