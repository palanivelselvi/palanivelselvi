package basicjavaprogram;

public class Minvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{7,8,4},{5,9,1},{2,6,3}};
		int min=a[0][0];
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				if(min>a[i][j]) {
					min=a[i][j];
				}
			}
		}
		
		System.out.println(min);

	}

}
