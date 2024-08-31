package coreJavaForAT;

public class childSuperDemo extends parentSuperDemo {
    
	String name = "child rahul";
	public void getStringData() //Super for same string
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()//Super for same method
	{
		System.out.println("I am in child class - Same Method Name");
		super.getData();
	}
	public childSuperDemo() //Super with Constructor
	{
		super();//rule:this should be always at first line
		System.out.println("child class constructor");
	}
	
	//This Keyword Practice
	 int a = 2; //instance variable & class level
	 
	 public void thisDemo()
	 {
		 int a=3;//local variable & method level
		 System.out.println(a); //prints out method level 
		 System.out.println(this.a); //prints out class level
		 int b= a+this.a;
		 System.out.println(b);
		 
	 }
	 
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Super keyword is for if there is same string name or method name in the both parent class and child class then use SUPER keyword for referring to parent class
		//Normally without SUPER Keyword it refers to child class because of overriding
		
		
		
		
		childSuperDemo csd = new childSuperDemo(); //for constrcutor
		csd.getStringData(); //for same string
		
 		csd.getData(); //for same method	
 		
 		//'This' keyword refers to current instance & object - object scope lies in class level
 		
 		csd.thisDemo();
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}

}
