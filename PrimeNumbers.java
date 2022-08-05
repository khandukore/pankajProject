package logicalprogramm;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=260;
		int count=0;
		for(int i=2;i<num;i++)
		{
			int a=num%i;
			
			if(a==0)
			{
				count++;
				break;
			}
			
		}
		if(count==1)
		{
			System.out.println(" this is not prime number ");
		}
		else
		{
			System.out.println("this  prime number");
		}

	}

}
