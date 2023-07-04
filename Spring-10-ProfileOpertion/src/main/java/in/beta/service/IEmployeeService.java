package in.beta.service;

import java.util.List;

import in.beta.dto.EmployeeDTO;

public interface IEmployeeService {

	public List<EmployeeDTO>  fetchEmpsByDesgs(String desgs[])throws Exception;
	
}
