package coreJavaForAT;

import java.util.ArrayList;

public class ArraysListIntro {

	//array is static and ArrayList is Dynamic size
	//ArrayList, LinkedList and Vector these classes implement from List Interface
	//(List Interface)above 3 classes can accept duplicate values
	//we can control the order of storing elements by properly pushing into specific index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> a = new ArrayList<String>();
        a.add("rahul");
        a.add("java");
        a.add("java");
        System.out.println(a);
        a.add(0,"student");
        System.out.println(a);
        /*a.remove(1);
        a.remove("java");
        a.removeAll(a);
        System.out.println(a);*/
        System.out.println(a.get(2));
        System.out.println(a.contains("java"));
        System.out.println(a.indexOf("rahul"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
