package ie.nuigalway.m.durcan8;

import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
	
	@Test
	public void UserNmaeTest(){
		Student student = new Student("martin",21,new Date(2/10/94));
		
		String expected = "martin21";
		String actual = student.GetUser();
		
		assertEquals(expected, actual);
	}
}
