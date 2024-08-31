package coreJavaForAT;
//traditional array, 
public class ArraysIntro {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array is a container which stores multiple values of same data type
		//traditional array //Static 
		/*int a[] = new int[5]; //Declared an array with integer datatype and allocated memory for the 5 values
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=9;//Initialized values into that array 
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//retrieve values present in the array
		}*/
		
		//array literal //dynamically we can allocate values directly into the array
		/*int b[] = {3,6,9,12,15,18};
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);//retrieve values present in the array
		}*/
		
		//MultiDimensional Arrays 1.Traditional 2.Literal
		//a[row-x][column-y]
		/*int a[][]= new int[2][3]; //1.
		a[0][0]=2;
	    a[0][1]=4;
	    a[0][2]=5;
	    a[1][0]=3;
	    a[1][1]=4;
	    a[1][2]=7;
	    System.out.println(a[1][0]);*/
	    
	   /* int b[][]= {{2,4,5},{3,4,7},{5,2,1}}; //2. 
	    //System.out.println(b[1][0]);
	    //outer for loop row index
	    //inner for loop column index
	    for(int i=0;i<3;i++)       /*matrix  2 4 5
	                                         3 4 7
	                                         5 2 1*/
	       /* {
	    	for(int j=0;j<3;j++) //retrieving all values in the MD Array
	    	{
	    		System.out.println(b[i][j]);
	    	}
	    
	        }*/
		
		/*  matrix    5 4 2 
	                  3 4 7
	                  9 2 1 */
		//Print minimum number from the above matrix //output 1
		  
		/*int abc[][]= {{5,4,2},{3,4,7},{9,2,1}};
		int min = abc[0][0];
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
				min=abc[i][j];	
				}
			}
		}
	    System.out.println(min);*/
	    
	    //Print Maximum number from the array //output 9
	   /* int def[][]= {{5,4,2},{3,4,7},{1,2,9}};
		int max = def[0][0];
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(def[i][j]>max)
				{
				max=def[i][j];	
				}
			}
		}
	    System.out.println(max);*/
		
		//find the minimum number and in the column of minimum number find the maximum number and print it 
		//Step 1 find the minimum number
		//Step 2 identify the column of minimum number
		//Step 3 find the maximum number in the identified column
		/* matrix  5 4 2
		           3 4 0
		           1 2 9*/
		//output 9 
		/*int def[][]= {{5,4,2},{3,4,0},{1,2,9}};
		int min = def[0][0];
		int mincolumn = 0;
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(def[i][j]<min)
				{
				min=def[i][j];
				mincolumn = j;
				}
			}
		}
	    int max = def[0][mincolumn];
	    int k = 0;
	    while(k<3)
	    {
	    if(def[k][mincolumn]>max)
	    {
	    	max= def[k][mincolumn];
	    }
	    k++;
	    }
		System.out.println(max);*/
		
		//Swapping variables with & without variables
		//1.
		/*int a=5; //output 4 & 5
		int b=4;
		int temp;
		temp = a; //Basket example apple & orange
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);*/
		
		//2.
		/*int a=5;
		int b=4;
		a=a+b;//a=9 //output 4 & 5
		b=a-b;//b=5 this is done
		a=a-b;//a=4 this is also done
		System.out.println(a);
		System.out.println(b);*/
		
		//Sorting an array(ascending or descending) using swapping approach
		//also known as bubble sort algorithm
		//output 1,2,3,.....9
		int a[] = {2,6,1,4,9,7,5,3,8};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) //'<' for descending 
				{
					//swapping
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print("\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
