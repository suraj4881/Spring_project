package in.demo.interfacelifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("in/demo/interfacelifecycle/Config.xml");
		
		context.registerShutdownHook();
		
		Student s1=context.getBean("st2", Student.class);
		
		System.out.println(s1);
		
		
	}

}
