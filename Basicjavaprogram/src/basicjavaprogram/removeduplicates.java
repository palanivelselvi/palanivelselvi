package basicjavaprogram;

import java.util.ArrayList;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,1,2,3,4,1,2,3,4};
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
						
			if(!ab.contains(a[i])) {
				
				ab.add(a[i]);
				
			}
			
			}
		
	Object[] abc=	ab.toArray();
	
	for(int k=0;k<abc.length;k++) {
		System.out.println(abc[k]);
	}
		
		
		}
	}


