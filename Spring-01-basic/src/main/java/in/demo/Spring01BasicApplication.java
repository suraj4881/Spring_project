package in.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring01BasicApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Spring01BasicApplication.class, args);
		System.out.println(context.getClass().getName());
	}

}
