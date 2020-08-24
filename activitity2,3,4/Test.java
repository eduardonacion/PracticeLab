import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
 public class Test {

	public static void main(String[] args) {
		//activity 4
		getSquare2(1,10);
		
		
		/* activity 3
		Arrange d1 = new Arrange (9,10,2002);
		Arrange d2 = new Arrange (8,20,2020);
		Arrange d3 = new Arrange (4,16,2005);
		Arrange d4 = new Arrange (3,24,2010);
		

		TreeMap<Arrange, String> syllabus = new TreeMap();
		syllabus.put(d1, "java");
		syllabus.put(d2, "python");
		syllabus.put(d3, "c++");
		syllabus.put(d4, "javascript");
				
		for (Map.Entry<Arrange, String> topic: syllabus.entrySet()) {
			if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
				System.out.println(topic.getValue());
			}else {
				System.out.println(topic.getValue() + "does not fall in setemper 2002");
					
				}
			}
			
		*/
		
		/* test for activity 3
		for (Map.Entry<Arrange, String> topic: syllabus.entrySet()) {
			System.out.println(topic.getKey() + "," + topic.getValue());
			}
			*/

		/* activity 2
		if(d1.compareTo(d2)== 1) {
			System.out.println(d1 + "is later than "+ d2);
		}else if(d1.compareTo(d2)== -1) {
			System.out.println(d1+ "is earlier than "+ d2);
		}else {
			System.out.println(d1 +"and "+ d2 + " are the same dates.");
		}
		*/
	}
	// activity 4
 	//iteration
 	static void getSquare(int n) {
 		for (int i = 0; i < n || i==n ; i++) {
 			System.out.println("the square of " + i + " is " + i*i);
			
		}
 		
 	}
 	// recursion
 	 static void getSquare2(int i, int n) {
 		if (i > n ||i == n) {
 			System.out.println(i+ "," + i*i);
 			getSquare2(i+1,n);
 		 }else {
 			 return;
 		 }
 	 }
	
 }
 
	

