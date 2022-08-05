package logicalprogramm;

import java.util.Scanner;

public class RevereseSring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String actual = sc.next();
		String rev="";
		for(int i=actual.length()-1;i>=0;i--)
		{
			rev=rev+actual.charAt(i);
			
		}
		System.out.println(rev);

	}

}
