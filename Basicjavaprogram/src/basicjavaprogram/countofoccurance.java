package basicjavaprogram;

public class countofoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = countOccurance("aabjtavaa",'a');
		System.out.println(count);

	}

	private static int countOccurance(String word, char letter) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		for(int i=0;i<word.length();i++) {
			
			if(word.charAt(i)==letter) {
				count++;
			}
			
		}
		return count;
		
	}

}
