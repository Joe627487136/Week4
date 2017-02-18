package Week4;

import java.util.ArrayList;

public class Russian {
	static ArrayList<Integer> testlist = new ArrayList<>();
	public static int multiply (int m, int n) {
		int toReturn = 0;
		while (n > 0) {
			System.out.println(n%2 == 1);
			if (n%2 == 1) {
				toReturn += m;
			}
			
			m = m*2; 
			n = n/2;
			testlist.add(n);
		}
		
		return toReturn;
	}
	public static void main(String[] args){
		System.out.println(multiply(10,3));
		System.out.println(testlist);
	}
}
