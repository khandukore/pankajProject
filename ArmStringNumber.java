package logicalprogramm;

public class ArmStringNumber {

	public static void main(String[] args) {
		//123-->1^3+2^3=3^3=1+8+27=36
		//153-->1^3+5^3+3^3=1+125+27=153// arm strong number
		int num=153;
		int ArmStrongnum=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			int arm = (rem*rem*rem);
			 ArmStrongnum = arm+ArmStrongnum;
			
		}
		System.out.println(ArmStrongnum);
		if(ArmStrongnum==num)
		{
			System.out.println("this num"+num+"is armstong num");
		}
		else {
			System.out.println("this num "+ num +" is armstong num");
		}
	}

}
