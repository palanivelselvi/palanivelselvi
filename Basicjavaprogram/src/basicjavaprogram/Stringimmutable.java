package basicjavaprogram;

public class Stringimmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="hello";
		String b="hello";
		String c = a.concat("world");
		System.out.println(c);
		String s = new String("hello");
		String t= new String("hello");
		System.out.println(a.equals(b));
		System.out.println(a.equals(s));
		System.out.println(a==b);
		System.out.println(a==s);
		System.out.println(s==t);
		
		

	}

}
