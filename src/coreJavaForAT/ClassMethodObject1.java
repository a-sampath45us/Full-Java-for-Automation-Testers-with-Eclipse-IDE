package coreJavaForAT;

public class ClassMethodObject1 {  //class name 
	int a = 5;
	public void getData()  //method name
	{
		System.out.println("Iam in a Method");
	}
			//objects are the instances/references of a class
	public static void main(String[] args) {  //this is main/executable block
		// TODO Auto-generated method stub

		ClassMethodObject1 fn = new ClassMethodObject1();  //creation of object with new memory
		fn.getData(); // with the help of the object calling the method
		System.out.println(fn.a);  // with the help of object calling the defined variable
		ClassMethodObject2 sn = new ClassMethodObject2();  //created a method in second class to call that method in the first class we need to create a new object with second class name in first class to access method present in second class
		sn.setData();
		System.out.println("Hello World");

	}

}
