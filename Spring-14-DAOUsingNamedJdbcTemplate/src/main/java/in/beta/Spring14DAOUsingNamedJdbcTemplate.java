package in.beta;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import in.beta.dto.EmployeeDTO;
import in.beta.service.IEmployeeService;

@SpringBootApplication
public class Spring14DAOUsingNamedJdbcTemplate {

	public static void main(String[] args) {
	ApplicationContext	context=SpringApplication.run(Spring14DAOUsingNamedJdbcTemplate.class, args);
	
	IEmployeeService service = context.getBean(IEmployeeService.class);
	
	String name = null;
	int id = 1;
	try {
		name = service.fetchEmployeeByNo(id);
		System.out.println(name);
		System.out.println();

		service.fetchEmployeesByDesg("batsman", "keeper", "bowler").forEach(System.out::println);
		EmployeeDTO dto = new EmployeeDTO();
		dto.setDesg("batsman");
		dto.setEaddress("RCB");
		dto.setEage(35);
		dto.setEname("FAF");
		dto.setSalary(4000);
		String status = service.registerEmployee(dto);
		System.out.println(status);

	} catch (DataAccessException e) {
		System.out.println("Record not available for the given id:: " + id);
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	((ConfigurableApplicationContext) context).close();
	
	}

}
