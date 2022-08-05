package logicalprogramm;

import java.util.HashMap;
import java.util.Set;

public class RepeatatingCharacter {

	public static void main(String[] args) {
		// hash map
		
		String a="abcxyzabcpqrabc";
		//create hash map object
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		for(int i=0;i<=a.length()-1;i++)//0,1,2
		{
			char charValue = a.charAt(i);//a,b,c
			
			if(mp.containsKey(charValue))
			{
				mp.put(charValue, mp.get(charValue)+1);
			}
			else
			{
				mp.put(charValue, 1);//a 1,b 2
			}
			
			
		}
		//System.out.println(mp);
		Set<Character> keys = mp.keySet();
		for ( Character key: keys) 
		{
			System.out.println(key+"= "+ mp.get(key));
		}
	}

}
