package basicjavaprogram;

public class Replaceowith$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "tomorrow";
		String k="";
		int count =0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!='o') {
				k=k+s.charAt(i);
			}
			else
			{
					count++;
				for(int j=0;j<count;j++)
					{
					
					k=k+"$";
				}
					
				
			}
		}
		
		System.out.println(k);

	}
}


