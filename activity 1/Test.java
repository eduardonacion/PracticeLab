import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> testInts = new ArrayList();
		testInts.add(10);
		testInts.add(10);
		testInts.add(15);
		testInts.add(20);
		
		System.out.println(Integers.computeSum(testInts));

	}

}
