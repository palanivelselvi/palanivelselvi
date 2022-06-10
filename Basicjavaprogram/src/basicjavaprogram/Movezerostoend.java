package basicjavaprogram;

public class Movezerostoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
	        int n = arr.length; 
	        int count =0;
			for(int i=0;i<n;i++) {
				if(arr[i]!=0) {
					arr[count]=arr[i];
					count++;
				}
			}
			
			while(count<n) {
				arr[count]=0;
				count++;
			}
	     //   moveZerosToEnd(arr, n); 
	        System.out.println("Array after pushing zeros to the back: "); 
	        for (int i=0; i<n; i++) 
	            System.out.print(arr[i]+" "); 

	}
	
	
	/*public static void moveZerosToEnd(int arr[],int n) {
		
		
		
	}*/

}
