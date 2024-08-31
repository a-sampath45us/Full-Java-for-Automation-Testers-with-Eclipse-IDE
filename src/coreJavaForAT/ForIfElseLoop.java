package coreJavaForAT;

public class ForIfElseLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(initialization;Condition;increment); for loop syntax 
		/* if else syntax
		 if(true) it goes inside the loop only if its true and executes the code inside 
		 {
		 print true // if else loop example
		 }
		 else
		 {
		 print false
		 }
		 */
		/*for(int i=0;i<=10;i++) //for loop example print 1 to 10
		{
			System.out.println(i);
		}*/
		
		// while loop print 1 to 10 sequentially
		/*int i = 0;
		while(i<=10) // while(true) it goes inside only when condition satisfies, until unless the condition becomes false inside the argument this loop will never stop executing
		{
			System.out.println(i);
			i++;
		}*/
		
		// do while loop // one loop of execution is guaranteed 
		/*int j = 21;
		do
		{
			System.out.println(j);
			j++;
		}
		while(j<=30);
        */		
		
		//nested loops working
		//outer for loop stands for row index
		//inner for loop stands for column index
		/*for(int i=1;i<=4;i++)//outer loop, this block will loop for 4 times
		{
			System.out.println("Outer Loop Started");
			for(int j=1;j<=4;j++)//inner loop, for completing one outer loop I have to complete four inner loops first
			{
				System.out.println("Inner Loop");
			}
			System.out.println("Outer Loop Finished");
		}*/
		
		// Printing Pyramid Triangle using 1 to 10 using outer loop and inner loop concept
		/* 1 2 3 4 //output
		   5 6 7
		   8 9
		   10
		 */
		/*int k=1; 
		for(int i=0;i<4;i++)//outer loop, this block will loop for 4 times
		{
			for(int j=1;j<=4-i;j++)//inner loop, for completing one outer loop I have to complete four inner loops first
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}*/
		
		//Inverted Sequence Pyramid Logic Program using 1 to 10 using outer and inner loop concept
		/* 1       //output
		   2 3
		   4 5 6
		   7 8 9 10
		 */
		
		/*int k=1; 
		for(int i=1;i<5;i++)//outer loop, this block will loop for 4 times
		{
			for(int j=1;j<=i;j++)//inner loop, for completing one outer loop I have to complete four inner loops first
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}*/
		
		//New Program
		/* 1      //output
		   1 2
		   1 2 3
		   1 2 3 4
		 */
		/*for(int i=1;i<5;i++)//outer loop, this block will loop for 4 times
		{
			for(int j=1;j<=i;j++)//inner loop, for completing one outer loop I have to complete four inner loops first
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}*/
		
		//New Program
		/* 3         //output
		   6 9
		   12 15 18
		   21 24 27 30
		 */
		int k=3; 
		for(int i=1;i<5;i++)//outer loop, this block will loop for 4 times
		{
			for(int j=1;j<=i;j++)//inner loop, for completing one outer loop I have to complete four inner loops first
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			System.out.println("");
		}
		

	}

}
