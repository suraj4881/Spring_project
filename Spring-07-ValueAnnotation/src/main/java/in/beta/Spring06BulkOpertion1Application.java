package in.beta;

import java.io.IOException;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.beta.comp.BillGenerator;




@SpringBootApplication
public class Spring06BulkOpertion1Application {

	public static void main(String[] args) throws IOException {
		ApplicationContext context=SpringApplication.run(Spring06BulkOpertion1Application.class, args);
		
		BillGenerator billGenerator = context.getBean(BillGenerator.class);
		System.out.println(billGenerator);
	
		
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
