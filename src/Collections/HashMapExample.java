package Collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "Hello");
		hmap.put(2,"hmap collection");
		hmap.putIfAbsent(3, "No");
		System.out.println(hmap);
		

	}

}
