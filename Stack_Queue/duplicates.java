import java.util.*;
class duplicates
{
 public static void main(String aa[])
 {
   Stack<Character> st=new Stack();
   String str="{(a+b)}";
    for(int i=0;i<str.length();i++)
     {
        char ch=str.charAt(i);
       if(ch==')')
       {
         if(st.peek()=='(')
         {
		  System.out.println("TRUE");
		  return;
		  }
		  else
		  {
		   while(st.peek()!='(')
		   {
			st.pop();

			}
			st.pop();
		   }
       }
       else
       {
       st.push(ch);
       }


     }
     System.out.println("False");
 }
}
