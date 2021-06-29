/**
 * 
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author mahanraj
 *
 */
public class StreamTest {
	public static void main(String[] args) {
		Student student1 = new Student(
	            "Jayesh",
	            20,
	            new Address("1234"),
	            Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
	 
	        Student student2 = new Student(
	            "Khyati",
	            20,
	            new Address("1235"),
	            Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
	 
	        Student student3 = new Student(
	            "Jason",
	            20,
	            new Address("1236"),
	            Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
	        
	        List<Student> studentLst = Arrays.asList(student1, student2, student3);
	        
	       Optional<Student> studentOptional = studentLst.stream()
	    		   							  .filter(student -> student.getName().equalsIgnoreCase("Jayesh"))
	    		   							  .findFirst();
	       System.out.println(studentOptional.isPresent()?studentOptional.get().getName():"No student present");
	       
	        Optional<Student> studentOptional1 = studentLst.stream()
	        									.filter(student -> student.getAddress().getZipcode().equals("1235"))
	        									.findFirst();
	        System.out.println(studentOptional1.isPresent()?studentOptional1.get().getName():"No student present");
	}  
        
	//https://dzone.com/articles/become-a-master-of-java-streams-part-1-creating-st
}
