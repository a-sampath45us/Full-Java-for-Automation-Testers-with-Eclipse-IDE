package coreJavaForAT;

public class childQatarAircraft extends ParentAirCraft { 
//extends keyword is for inheriting the methods present in Parent Class to Child Class
       int i =20;
       
       
       
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //abstract method is defined and has no implementation
		//if abstract method is present in a class it is called Abstract Class
		//Abstract Class has methods(defined+Implemented) and abstract methods
		// we can't create object for Abstract Class
		childQatarAircraft a = new childQatarAircraft();//by creating object for this child class we can access methods present in parent class(using extends keyword) and local child class
       a.engineGuidelines();
       a.safetyGuidelines();
       a.bodyColor();
      //Inheritance is bringing methods, variables and objects present in parent class to the child class using extends keyword
       //In Java we can't have multiple inheritances that is one child can't have two or more parents
       //String defined in Parent class
      System.out.println(a.airbag); //String can be printed using this way
      a.airbagGuidelines(); //and also String can be printed by defining and Implementing in the local child class
	  
     ParentAirCraft pt = new childQatarAircraft(); //object referring to parent class
     System.out.println(pt.i); //output 10
	 childQatarAircraft ct = new childQatarAircraft(); //object referring to child class
	 System.out.println(ct.i); //output 20 
	 
	 //Polymorphism Overloading and Overriding (POLOR)
	 //Function Overriding - OR (Same method names & arguments in Parent and Child Class)
	 //In Overriding - Object either referring to Parent or Child it overrides the function preference to local child class(both methods have same name, signature and parameters everything same)
	 ParentAirCraft por = new childQatarAircraft();
	 por.audioSystem();//method is in Parent Class & object referred to Parent Class
	 childQatarAircraft cor = new childQatarAircraft();
	 cor.audioSystem(); //method is in Child Class & Object referred to Child Class
	 //Function Overloading - OL (Same method names In a local Class Only) follows two rules
	 //1.either argument count should be different
	 //2.argument data type should be different
	 childQatarAircraft col = new childQatarAircraft();
	 col.getData(2);
	 col.getData(2, 5);
	 col.getData("rahul");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Brown Body Color Implemented");
	}
	public void airbagGuidelines()
	{
	    System.out.println(airbag);	
	}
	public void audioSystem() //Overriding Example
	{
		System.out.println("Child Audio System Enhanced");
	}
	public void getData(int a) //Overloading Example 1 
	{
		System.out.println(a);
	}
	public void getData(int a,int b) //Overloading Example 2
	{
		System.out.println(b);
	}
	public void getData(String a) //Overloading Example 3 
	{
		System.out.println(a);
	}
	}


