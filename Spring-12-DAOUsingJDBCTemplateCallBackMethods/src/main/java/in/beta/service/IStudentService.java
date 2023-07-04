package in.beta.service;

import java.util.List;
import java.util.Map;

import in.beta.dto.StudentDTO;

public interface IStudentService {

	public StudentDTO fetchStudentByNo(int no);
	public List<StudentDTO> fetchStudentByName(String name1,String name2);
	
}
