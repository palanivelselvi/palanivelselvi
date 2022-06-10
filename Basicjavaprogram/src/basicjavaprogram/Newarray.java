package basicjavaprogram;

import java.util.ArrayList;

public class Newarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {3,5,7,9};
		int[] b= {1,5,2,9};
		ArrayList ab = new ArrayList();
		for(int i=0;i<a.length;i++)
			if(a[i]==b[i]) {
				
				ab.add(a[i]);
				
			}
		Object[] c=ab.toArray();
		for(Object ob:c)
		{
			
			System.out.println(ob);
		}
	

	}

}
