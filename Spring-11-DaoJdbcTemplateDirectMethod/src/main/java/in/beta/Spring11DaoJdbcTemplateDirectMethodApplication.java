package in.beta;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.beta.service.IEmployeeService;

@SpringBootApplication
public class Spring11DaoJdbcTemplateDirectMethodApplication {

	public static void main(String[] args) {
	ApplicationContext	context=SpringApplication.run(Spring11DaoJdbcTemplateDirectMethodApplication.class, args);
	
	IEmployeeService service = context.getBean(IEmployeeService.class);
	
//	Integer getcount=service.fetchEmpsCount();
//	System.out.println(getcount);
	
//	String getEmpDetails=service.getEmployeeNameByNo(3);
//	System.out.println(getEmpDetails);
	
//	Map<String, Object> getEmpDetail=service.getEmployeeDetailsByNo(3);
//	System.out.println(getEmpDetail);
	
//	List<Map<String, Object>> list = service.getEmployeeDeatilsByDesignation("batsman", "keeper");
//	System.out.println(list);

//	Integer insert=service.insertEmp("rahul", 30, "lsg", "batsman", 21000);
//	System.out.println(insert);
	
	Integer addbn =service.addBonusToEmpByDesg("batsman", 1000);
	System.out.println(addbn);
	
	((ConfigurableApplicationContext) context).close();
	
	}

}
