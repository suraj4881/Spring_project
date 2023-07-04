package in.beta.dao;


import java.util.List;


import in.beta.bo.StudentBO;

public interface IStudentDao {

	public StudentBO getStudentByNo(int sno) ;
	public List<StudentBO> getStudentByName(String name1,String name2) ;
}
