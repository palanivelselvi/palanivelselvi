package basicjavaprogram;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
		String t="";
		for (int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		System.out.println(t);
		
		if(t!=s) {
			System.out.println("not palindrome");
		}
		else
		{
			System.out.println("palindrome");
		}
	}

}
