package logicalprogramm;

public class InBtweenPrimeNumber {

	public static void main(String[] args) {
		// In between prime number
		int a=1;
		int b=100;
		//int d=1;
		for(int i=a;i<=b;i++)
		{
			for(int j=2;j<i;j++)
			{
				int d=i%j;
				if(d!=0)
				{
					System.out.println(d);
				}
				
			}
			
		}

	}

}
