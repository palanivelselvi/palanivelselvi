package basicjavaprogram;

import java.util.Arrays;

public class Sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = {"Ramesh","selvi","Imaya"};
		Arrays.sort(s);
		displayArray(s);

	}

	private static void displayArray(String[] s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
	}

}
