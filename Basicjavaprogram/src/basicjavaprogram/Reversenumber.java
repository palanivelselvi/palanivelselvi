package basicjavaprogram;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 543;
		int digit =0;
		int reverse =0;
		while(a!=0) {
			
			digit = a%10;
			reverse=digit+reverse*10;
			a=a/10;
			
		}
		
		System.out.println(reverse);

	}

}
