package logicalprogramm;

import java.util.HashMap;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		//
		
		String a="abc pqr abc xyz pqr";
		
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		String[] ar = a.split(" ");//{"abc","pqr","abc"...}
		for(int i=0;i<=ar.length-1;i++)
		{
			String s1=ar[i];
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
		}
		System.out.println(mp);
		Set<String> keys = mp.keySet();
		for ( String key : keys)
		{
			System.out.println(key+" ="+mp.get(key));
		}

	}

}
