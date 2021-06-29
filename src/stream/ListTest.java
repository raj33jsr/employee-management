/**
 * 
 */
package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mahanraj
 *
 */
public class ListTest {

	
	public static void main(String[] args) {
		List<Student> listone = new ArrayList<Student>();
		List<Student> listtwo = new ArrayList<Student>();
		
		Student s1 = new Student("Rajesh", 1, null,  null);
		Student s2 = new Student("Rajesh1", 2, null,  null);
		Student s3 = new Student("Rajesh", 1, null,  null);
		Student s4 = new Student("Rajesh1", 3, null,  null);
		listone.add(s1);
		listone.add(s2);
		listtwo.add(s3);
		listtwo.add(s4);
		System.out.println(listone.equals(listtwo));
		List<String> listThree = new ArrayList<String>();
		List<String> listFour = new ArrayList<String>();
		listThree.add("Rajesh");
		listThree.add("Rajesh1");
		listFour.add("Rajesh");
		listFour.add("Rajesh1");
		System.out.println(listThree.equals(listFour));
		
	}
	
}
