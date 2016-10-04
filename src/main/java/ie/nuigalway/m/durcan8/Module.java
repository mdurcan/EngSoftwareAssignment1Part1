package ie.nuigalway.m.durcan8;

import java.util.List;

public class Module {

	private String ModuleName, ID;
	private List<Student> students;
	
	public Module(String Name, String ModuleCode){
		this.ModuleName=Name;
		this.ID=ModuleCode;
	}
	
	public void AddStudents(Student student){
		students.add(student);
	}
	
	public String GetModuleName(){
		return this.ModuleName;
	}
	
	public String GetID(){
		return this.ID;
	}
	
	public List<Student> GetStudents(){
		return this.students;
	}
}
