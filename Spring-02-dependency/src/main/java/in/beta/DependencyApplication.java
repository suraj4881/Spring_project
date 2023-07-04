package in.beta;



import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.beta.comp.WishMessageGenerator;

@SpringBootApplication
public class DependencyApplication {
	
	static {
		System.out.println("DependencyApplication.enclosing_method()");
		
	}
	

	public DependencyApplication() {
		System.out.println("DependencyApplication.DependencyApplication()");
	}

	   @Bean
	   public LocalDateTime createObj() {
		System.out.println("BootProj02DependancyInjectionApplication.createObj()");
		return LocalDateTime.now();
	}

	    public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DependencyApplication.class, args);
		WishMessageGenerator wmg=context.getBean(WishMessageGenerator.class);
		Object obj=wmg.greetUser("suraj");
		System.out.println(obj);
		
		((ConfigurableApplicationContext)context).close();
	}

}
