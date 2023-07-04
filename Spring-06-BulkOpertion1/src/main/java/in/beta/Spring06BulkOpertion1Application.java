package in.beta;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.beta.comp.Company1;
import in.beta.comp.Company2;

@SpringBootApplication
public class Spring06BulkOpertion1Application {

	public static void main(String[] args) throws IOException {
		ApplicationContext context=SpringApplication.run(Spring06BulkOpertion1Application.class, args);
		
		Company1 company1 = context.getBean(Company1.class);
		System.out.println(company1);
		
		System.in.read();
		
		Company2 company2 = context.getBean(Company2.class);
		System.out.println(company2);
		
		((ConfigurableApplicationContext) context).close();
	}

}
