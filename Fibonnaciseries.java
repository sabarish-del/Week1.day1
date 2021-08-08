package Week1Day1;

public class Fibonnaciseries {
	public static void main(String[] args) {
		
		int i= 10;
		int j=1;
		int k=1;
		
		for (int l = 5; l<=i; l++) {
			
			l=j+k;
			System.out.println(l);
			j=k;
			k=l;
		}
			
		}
	
}

