package ie.nuigalway.m.durcan8;

import java.util.Date;

public class Student {
	private String Name, UserName;
	private int Age;
	private Date DOB;
	
	public Student(String name,int age, Date dateofbirth){
		this.Name=name;
		this.Age=age;
		this.DOB=dateofbirth;
		this.UserName=GetUserName(name,age);
	}
	
	public String GetUserName(String name, int age){
		return (name+ Integer.toString(age));
	}
	
	public String GetName(){
		return this.Name;
	}
	
	public String GetUser(){
		return this.UserName;
	}
	
	public int GetAge(){
		return this.Age;
	}
	
	public Date GetDOB(){
		return this.DOB;
	}
}
