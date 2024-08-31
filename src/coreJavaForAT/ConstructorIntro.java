package coreJavaForAT;


public class ConstructorIntro {
	//Default Constructor
	public ConstructorIntro()
	{
		System.out.println("I am in Default Constructor"); //constructor
	}
	//Parameterized Constructors
	
	public ConstructorIntro(int a, int b)
	{
		System.out.println("I am in Parameterized Int Constructor");
		int c=a+b;
		System.out.println(c);
	}
	public ConstructorIntro(String str)
	{
		System.out.println("I am in Parameterized String Constructor");
		System.out.println(str);
	}
	public void getData()
	{
		System.out.println("I am in Method"); //method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Constructor will not return value so no void
		//method will return value so it has void
		//the name of the constructor should be class name
		
		//Whenever an object is created in a class the block of code present in Constructor will get executed
		//Whenever an object is created in a class the constructor is called 
		//Compiler will call implicit constructor if you have not defined any constructor block
		//Implicit constructor is like default/present in internal libraries
		//Explicit constructor is created by external users
		//people use constructors for initiating objects, variables and some properties
		
		//we can't define two same constructors
		//for example if there is one constructor(int type) relating to two new created objects(int type) then the compiler calls that constructor(int type) two times
		
		
		//ConstructorIntro cd = new ConstructorIntro();
		//ConstructorIntro cdi = new ConstructorIntro(4,5);
		//ConstructorIntro cdi2 = new ConstructorIntro(6,9);
		//ConstructorIntro cds = new ConstructorIntro("hello");
		
		
		
		
		
		
		
		
		
		
		
	}

}
