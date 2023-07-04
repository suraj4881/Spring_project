package in.beta.service;

import java.util.List;
import java.util.Map;

import in.beta.bo.EmployeeBO;
import in.beta.dto.EmployeeDTO;

public interface IEmployeeService {

	public List<EmployeeDTO> fetchEmployeesByDesg(String desg1,String desg2,String desg3);
	public String registerEmployee(EmployeeDTO dto);
	public String fetchEmployeeByNo(int no);
	
}
