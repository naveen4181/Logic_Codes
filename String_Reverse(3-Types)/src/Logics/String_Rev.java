package Logics;
import java.util.*;

class Char
{
   protected String s ="esreveR";
   
   
  public void Char() 
   {
	  System.out.println("Original String:"+s);
	   for(int i=s.length()-1;i>=0;i--)
	   {  
		   char c=s.charAt(i);
          
		   System.out.print(c);
	   
	          
	   }
	   
	   System.out.println();
   }


}





class Buffer extends Char
{
	
public void Buffer(){
	
	
	StringBuffer sf=new StringBuffer(s);
	StringBuffer g = sf.reverse();
	
	System.out.print(g);
	
System.out.println();	
}

}


class CharArr extends Char
{
public	 void CharArr() 
{char c[] =s.toCharArray();

for(int i=s.length()-1;i>=0;i--)
{
	
System.out.print(c[i]);
}
System.out.println();





}
}


public class String_Rev {

	public static void main(String[] args) {
	

		CharArr Ca=new CharArr();
		Ca.Char();
		Ca.CharArr();
		

		Buffer B=new Buffer();
		B.Buffer();
		
	}

}
