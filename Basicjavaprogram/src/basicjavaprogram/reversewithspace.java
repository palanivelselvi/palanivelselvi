package basicjavaprogram;

public class reversewithspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "I am Imaya Kutty";
		char[] nameArray = name.toCharArray();
		char[] reverse = new char[nameArray.length];
		for(int i=0;i<nameArray.length;i++) {
			if(nameArray[i]==' ') {
				reverse[i]=' ';
			}
		}
	  
		int j = nameArray.length-1;
		for(int i=0;i<nameArray.length;i++) {
			if(nameArray[i]!=' ') {
				if(reverse[j]==' ') {
					j--;
				}
				
				reverse[j]=nameArray[i];
				j--;
			}
		}
		
		System.out.println(name+"--->"+String.valueOf(reverse));
		
	}
}
	

