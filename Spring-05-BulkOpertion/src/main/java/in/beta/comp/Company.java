package in.beta.comp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Company {

	@Value("${org.info.companyName}")
	private String name;
	
	@Value("${org.info.companyLocation}")
	private String Location;
	
	@Value("${org.info.copmanySize}")
	private int size;
	
	
	static {
		System.out.println("Company.enclosing_method()");
	}
	
	
	public Company() {
		System.out.println("Company.Company()");
	}
	
	
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", Location=" + Location + ", size=" + size + "]";
	}
	
	
}
