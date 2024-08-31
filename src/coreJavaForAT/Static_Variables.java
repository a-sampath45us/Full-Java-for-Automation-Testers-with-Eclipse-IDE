package coreJavaForAT;

public class Static_Variables {

	//Suppose there's a census report is going on in city Bangalore we need to collect name,address,city
	String name; //Instance variables & class level
	String address;//Instance variables & class level
	static String city = "Bangalore"; //static or class variables
	static int i=0; //static variable
	int j=0; //instance variable
	
	//Static block
	static String country;
	static int k;
	static {
		country = "india";
		System.out.println("Static Block");
		k=0;
	}
	
	
	
	public Static_Variables(String name,String address)//created a parameterized constructor //local variables & method level
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i); //output 1 2 3
		j++;
		System.out.println(j); //output 1 1 1
	    k++;
	    System.out.println(k); //output 1 2 3 //created for static block   
	}
	
	public void getData()
	{
		System.out.println(name+" "+address+" "+city+" "+country);
	}
	//static method only accepts static variables
	//we can't call static methods with objects 
	//we can call static methods using class name
	
	
	public static void getcity() //static method 
	{
		System.out.println(city);
		System.out.println(country);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Static_Variables obj = new Static_Variables("Bob","Marathahalli");
        Static_Variables obj1 = new Static_Variables("Ram","Jayanagar");
        Static_Variables obj2 = new Static_Variables("Teja","Bellandur");
		obj.getData(); //object calling method
		obj1.getData();
		obj2.getData();
		Static_Variables.getcity(); //calling static method using class name dot
		
        
        
        //Creating an object & creating an instance is same
        //every object present in main calls the constructor 
        //object calls the constructor and then stores values with their object in the local variables first
		//after that   values with their objects stored in instance variables from local variables 
		//Instance variables change object to object
        //Instance variables dependent on objects
        //Instance variable there is no sharing,everytime an object is created it freshly access the variable,it will not remember what other object manipulated the variable
        //static variables - all objects will refer to same variable one copy
        //Static variables - this variable is shared by all the objects
        //Static variables are independent of objects 
        //static variables belongs to classes not objects   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
   }

}
