package coreJavaForAT;

public abstract class ParentAirCraft {
	
	
	
	String airbag = "airbags are Implemented";
	
	int i = 10; 
	
	public void engineGuidelines()
	{
	  System.out.println("Engine Guidelines Implemented");	
	}
	public void safetyGuidelines()
	{
		System.out.println("Safety Guidelines Implemented");
	}
	public abstract void bodyColor();
	
	public void audioSystem() //Overriding Example
	{
		System.out.println("Parent Audio System");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
