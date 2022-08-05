package logicalprogramm;

public class ReverseNumWithoutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(123/10);
//		System.out.println(123%10);
		
		int num=123;
		int revnum=0;
		for(int i=num;i>0;i=i/10)//123,12,1
		{
			int rem=i%10;//3,2,1
			revnum=revnum*10+rem;
			
		}
		System.out.println(revnum);
		

	}

}
