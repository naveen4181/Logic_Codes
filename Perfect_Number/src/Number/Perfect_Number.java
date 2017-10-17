package Number;

import java.util.*;
public class Perfect_Number {
	
	static public void main(String abc[])
	{
		
		int number=0,temp=0;
		System.err.println("PERFECT NUMBER CHECK");
		System.out.println();
		System.out.print("Enter a number:");
		 Scanner s=new Scanner(System.in);
	   	number=s.nextInt();
	   	
		
		 for(int i=0;i<=number/2;i++)
		 {
			 
		
			 temp+=i;
			 
		 
		  }
		 
		 if(number==temp)
		 
		 {
			 
			 System.out.println("Perfect Number");
			 
		 } 
		 else
		 {
			 
			 System.err.println("Not an Perfect Number");
			 
			 
		 }
		
		 
	}

}
