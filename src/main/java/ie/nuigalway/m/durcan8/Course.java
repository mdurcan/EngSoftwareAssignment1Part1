package ie.nuigalway.m.durcan8;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class Course {

	private String CourseName;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private DateTime Start, End;
	
	public Course(String Name, DateTime StartDate, DateTime EndDate){
		this.CourseName=Name;
		this.Start=StartDate;
		this.End=EndDate;
	}
	
	public void AddModules(Module module){
		this.modules.add(module);
	}
	
	public String GetCourseName(){
		return this.CourseName;
	}
	
	public List<Module> GetModules(){
		return this.modules;
	}
	
	public DateTime GetStartDate(){
		return this.Start;
	}

	public DateTime GetEndDate(){
		return this.End;
	}
}
