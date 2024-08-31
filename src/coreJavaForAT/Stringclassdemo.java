/*package coreJavaForAT;

public class Stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // string can be defined in two ways
		String a = "hello"; //1. string literal
		String b = "hello"; //no new memory and no new object is created
		String ab = new String("Hello"); //2. string class object // new memory and new object is created even though its a same string		
	    a.concat("World");
	    System.out.println(a);
	    String s = new String("hello");
	    String s1 = new String ("hello"); //String class creates new object every time in memory
	    
	    System.out.println(a.equals(b));//true
	    System.out.println(a==b);//true
	    System.out.println(a.equals(s));//true equals operator checks for content in the string
	    System.out.println(a==s);//fail matching the references(Objects)
	    System.out.println(s==s1);//fail references are diff as they are defined with string class
	    System.out.println(a.equalsIgnoreCase(s)); //true
	    
	    
	    
	    
	    
	//the above strings are immutable that means they can't be altered or changed from original
		// String Buffer and String Builder are mutable 
	    StringBuffer sb = new StringBuffer("Hello"); //String Buffer controls using variables 
	    sb.append("world"); // String Buffer is sequential, after one usage it goes to another 
	    System.out.println(sb);//Helloworld
	    sb.insert(2, "she");
	    System.out.println(sb);//Heshelloworld
	    sb.replace(5,7,"aa");
	    System.out.println(sb);//Hesheaaoworld
	    sb.deleteCharAt(12);
	    System.out.println(sb);//Hesheaaoworl
	    sb.reverse();
	    System.out.println(sb);//lrowoaaehseH
	    StringBuilder sbd = new StringBuilder("hello");
	    // String Builder is not thread safe. non synchronized, it is faster
	
	    
	
	
	
	
	
	
	
	
	
	}

}*/
