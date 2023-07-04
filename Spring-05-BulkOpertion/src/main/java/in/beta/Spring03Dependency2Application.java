package in.beta;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.beta.comp.Company;




@SpringBootApplication
public class Spring03Dependency2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring03Dependency2Application.class, args);

		 Company c =context.getBean(Company.class);
		 System.out.println(c);
		 
		((ConfigurableApplicationContext) context).close();
	}

}
