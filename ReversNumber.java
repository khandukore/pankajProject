package logicalprogramm;

public class ReversNumber {

	public static void main(String[] args) {
		
		
		int num=123;
		String strnum = Integer.toString(num);
		String rev="";
		for(int i=strnum.length()-1;i>=0;i--)
		{
			rev=rev+strnum.charAt(i);
		}
		System.out.println(rev);

	}

}
