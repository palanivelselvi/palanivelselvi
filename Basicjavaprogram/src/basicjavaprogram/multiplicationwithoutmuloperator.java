package basicjavaprogram;

public class multiplicationwithoutmuloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mul=sumMulti();
		System.out.println(mul);

	}

	public static int sumMulti() {
		// TODO Auto-generated method stub
		int mul = 0;
		int i=5;
		int j=10;
		int k=1;
		while(k<=j)
		{
			mul=mul+i;
			k++;
		}
		return mul;
	}

}
