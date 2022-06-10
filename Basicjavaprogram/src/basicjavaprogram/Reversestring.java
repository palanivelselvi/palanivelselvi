package basicjavaprogram;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Selvi";
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println(reverse);

	}

}
