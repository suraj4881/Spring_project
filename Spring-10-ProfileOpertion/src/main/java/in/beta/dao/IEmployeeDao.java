package in.beta.dao;

import java.util.List;

import in.beta.bo.EmployeeBO;

public interface IEmployeeDao {

	public  List<EmployeeBO>  getEmpsByDesg(String cond)throws Exception;
	
}
