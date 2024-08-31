package coreJavaForAT;

public class Interfaces implements InterfaceCentralTraffic,InterfaceContiTraffic { //Implements keyword is for bringing the methods present in Interface to this class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interfaces and classes are on the same line
		//the only difference is Interfaces only has methods but not the body
		//classes should define and implement those methods present in Interface
		//One class can Implement more than one Interface
		InterfaceCentralTraffic a = new Interfaces();//I have created an object in this class to implement methods present in the interface
        a.greenGo();
        a.redStop();
        a.flashYellow();
        
        Interfaces at = new Interfaces(); //Created object with reference to this class
        at.walkOn();
        
        InterfaceContiTraffic ct = new Interfaces();//created object in this class with reference to Interface(InterfaceContiTraffic)
        ct.trainStop();
		
		
	}

	public void walkOn() //This method is defined and Implemented in this class
	{
		System.out.println("walkOn Implemented");
	}
	
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGO Implemented");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implemented");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow Implemented");
	}

	@Override
	public void trainStop() {
		// TODO Auto-generated method stub
		System.out.println("trainStop Implemented");
	}

}
