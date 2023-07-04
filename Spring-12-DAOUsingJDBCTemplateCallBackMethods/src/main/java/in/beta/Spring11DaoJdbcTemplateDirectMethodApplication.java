package in.beta;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.beta.dto.StudentDTO;
import in.beta.service.IStudentService;

@SpringBootApplication
public class Spring11DaoJdbcTemplateDirectMethodApplication {

	public static void main(String[] args) {
	ApplicationContext	context=SpringApplication.run(Spring11DaoJdbcTemplateDirectMethodApplication.class, args);
	
	IStudentService service = context.getBean(IStudentService.class);
	
//     StudentDTO st=service.fetchStudentByNo(1);
//     System.out.println(st);
	

	List<StudentDTO> list = service.fetchStudentByName("suraj","dhoni");
	list.forEach(System.out::println);
	
	((ConfigurableApplicationContext) context).close();
	
	}

}
