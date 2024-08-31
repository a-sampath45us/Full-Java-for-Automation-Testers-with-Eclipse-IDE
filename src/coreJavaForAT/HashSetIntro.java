package coreJavaForAT;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {

	//HashSet, LinkedHashSet, TreeSet these 3 classes implements Set Interface
	//(Set Interface) above 3 classes does not accept duplicate values
	//There is no guarantee elements are stored in sequential order... random order
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("USA");
		hs.add("Canada");
		hs.add("Nepal");
		hs.add("Qatar");
		System.out.println(hs);
		//System.out.println(hs.remove("USA"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());	
		
		//HashSet using Interator
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) //checks whether next index is present or not
		{
			System.out.println(i.next()); //It goes to a Index prints the value present in it. starts from base position. base->0thIndex->1stIndex.....so on 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
