package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj1=new ArrayList();
		obj1.add(40);
		obj1.add(20);
		obj1.add(30);
		System.out.println(obj1);
		Collections.sort(obj1);
		System.out.println(obj1);
	
		//Collections.sort(obj1, Collections.reverseOrder())
	}

}
