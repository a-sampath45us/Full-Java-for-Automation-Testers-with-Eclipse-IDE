package coreJavaForAT;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Exceptions demo //Try Catch Mechanism
		//Using that mechanism we can catch the error and print it in the output without failing of the script
		//if there is a block of code that we use occasionally put that in try catch mech so that script doesn't fail
		//for example pop ups on Christmas & New Year's Day
		//one try can be followed by multiple catch blocks
		//catch should be an immediate block after try, nothing comes between them
		//One try can catch only one exception 
		
		try
		{
			int a=4;
			int b=0;
			int k = a/b;
			System.out.println(k);
			//int arr[] = {1,2,3};
			//System.out.println(arr[5]);
		}
		/*catch(ArithmeticException et) //specific exception like a child class
		{
			System.out.println("I caught an Arithmetic Exception");		
		}
		catch(IndexOutOfBoundsException ets) //specific exception like a child class
		{
			System.out.println("I caught an out of Bounds Exception");
		}*/
		
		catch(Exception e) //Parent class //It contains all exceptions //use this if u don't know specific exception
		{
			System.out.println("I caught an Exception");
		}
		finally
		{
			//this block is executed irrespective of exception thrown or not
			//finally should be written only when we use try block
			//suppose if u r building automation script and script got failed in the middle 
			//then u can use finally block for example deleting cookies and closing browser
			//try block script pass or faill finally block get executed
			//finally block will stop executing only when u terminate JavaVirtualMachine(JVM) before it got executed
			System.out.println("Cookies Deleted & Browser Closed");
		}
		
		
		
		
	}

}
