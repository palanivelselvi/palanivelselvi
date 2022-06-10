package basicjavaprogram;

public class addarraysvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		for(int i=0;i<a.length-1;i++)
		{
			//int[] b = {};
			int c=0;
			int k=i+1;
			while(k<=a.length-1)
			{
			c=c+a[i]+a[k];
			k++;
			}
			
			System.out.println(c);
		}

	}

}
