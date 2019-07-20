package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hsobj=new HashSet<String>();
		hsobj.add("Hello");
		hsobj.add("hello");
		hsobj.add("Hello");
		hsobj.add(null);
		hsobj.add(null);
		//System.out.println(hsobj.size());
		//System.out.println(hsobj);
		
		Iterator<String> itr=hsobj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*for(String str:hsobj)
		{
			System.out.println(str);
		}*/
		
	}

}
