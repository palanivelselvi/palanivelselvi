package basicjavaprogram;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int sum=0;
		int i=0;
		while(i<10) {
			
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			i++;
		}

	}

}
