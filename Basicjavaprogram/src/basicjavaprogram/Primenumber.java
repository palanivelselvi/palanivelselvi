package basicjavaprogram;

public class Primenumber {
	
	static int val=30;
	 static boolean flag = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(flag)
		{
			System.out.println("It is not prime number");
		}
		else
		{
			System.out.println("It is prime number");
		}
		}
	
	public static boolean prime() {
		for(int i=2;i<=val/2;i++)
		{
			if(val%i==0) {
				flag=true;
				break;
			}
		}
		
		return flag;
	}

}
