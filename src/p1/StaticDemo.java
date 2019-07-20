package p1;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj1=new Example();
		Example obj2=new Example();
		Example obj3=new Example();
		

	}

}
class Example
{
	static int x=6;
	int y=6;
	public Example()
	{
		x++;
		y++;
		System.out.println("The value of x is"+x);
		System.out.println("The value of y is"+y);
	}
			
}