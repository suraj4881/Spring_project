package in.demo.annotationautowirid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("in/demo/annotationautowirid/Config.xml");
		
		Student s1=context.getBean("st2", Student.class);
		
		System.out.println(s1);
		
		
	}

}
