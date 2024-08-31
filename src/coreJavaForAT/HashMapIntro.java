package coreJavaForAT;

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;*/

public class HashMapIntro {

	//HashMap,TreeMap,LinkedHashMap these 3 classes implements Map Interface
	//Map is an Object that maps keys(like an Index) to values
	//(Map Interface) above 3 classes can't contain duplicate keys & can contain duplicate values
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		/*HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0,"hello");
		hm.put(1,"gudmorning");
		hm.put(2,"gudafternoon");
		hm.put(3,"gudnight");
		System.out.println(hm);
		//hm.remove(2);
		//System.out.println(hm.get(2));
		//System.out.println(hm);
		Set<Entry<Integer, String>> sn = hm.entrySet();//HashMap to Set	
		Iterator<Entry<Integer, String>> it = sn.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> mp = (Map.Entry<Integer, String>)it.next(); //if we print it.next(like in HashSet) it throws error because it don't know which to pick either key or value (key & value are mapped together).
			System.out.println(mp.getKey()); //we are casting with Map.Entry so it knows it's a map kind of structure so it separates in the form of Key & Value, and it provides us in two different formats
			System.out.println(mp.getValue());
		}*/
		
		//Printing unique number in a set of duplicate numbers - Amazon Question
		//output1 4-3times, 5-3times, 6-2times, 9-1time
		//output2 9 is unique number
		
		/*int a[] = {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> ab = new ArrayList<Integer>(); //created an empty array
		
		for (int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				for (int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
			System.out.println(a[i]); //output1
			System.out.println(k); //output2
				if(k==1)
					System.out.println(a[i] +" " + "is unique number"); //output2
			}
			
			
		}*/
		
		//Final Key Word 
		
		// final int i = 4; //it becomes constant variable and it can't be changed by any other class
		// final void method can't be overridden, it becomes unique and same name can't be used again
		// final class finaldemo{ that means u can't extend that class, u can't inherit the class & can't use it as a parent class
		
		//Access Modifiers
		//Public, Private, Protected, Default
		
		//Default(for methods & Variables(eg: int i=4;)) - access methods/variables anywhere between classes only present in same package. can't use between packages. eventhough if u import package.class u will have access to class but not methods
		
		//Public : variable(eg: public int i=4;)/method as public : then you will have access across all the packages
		
		//Private : you can't access method or variable outside the class in a package
		
		//Protected : variable/method as protected : access methods/variables anywhere between classes only present in same package + u can access those methods/variables in sub or child class inherited from parent class present in different packages that means parent class in one package & child class in other package
		//Protected = Default + another feature
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
