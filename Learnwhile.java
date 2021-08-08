package Week1Day1;

public class Learnwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 545;
		int sum=0;
		while(n>0)
		{
			int reminder = n%10; // 5
			sum = sum+reminder;
			n= n/10;
		}
		System.out.println("sum of given numbers " + sum);

	}

}
