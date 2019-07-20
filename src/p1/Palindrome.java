package p1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="madam";
		for(int i=0;i<=a.length();i++)
			for(int j=a.length();j<=a.length();j--)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					System.out.println(a.charAt(j));
				}
				
			}
		
	}

}
