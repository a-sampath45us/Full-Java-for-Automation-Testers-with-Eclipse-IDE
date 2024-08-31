package coreJavaForAT;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //if you reverse the string it is same as before it is called Palindrome eg: madam
		String s = "rahul"; // put rahul or madam
		String t = "";
		
		for (int i = s.length()-1; i>=0; i--)
		{
			t= t+ s.charAt(i);
		}
		
		System.out.println(t);
		
		if (s.equals(t));
		{
			System.out.println("It is Palindrome");
		}
        /*else
		{
			System.out.println("It is not Palindrome");
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
