import java.io.*;
import java.util.*;

public class Balance_bracket {

    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner(System.in);

        String exp = scn.nextLine();
          boolean b1=Balance(exp);
        System.out.println(""+b1);
    }
//  ((()
    public static boolean Balance(String str)
    {
		Stack<Character> st=new Stack<Character>();
		 for(int i=0;i<str.length();i++)
		 {
		  char ch=str.charAt(i);
		    if(ch=='('||ch=='{'||ch=='[')
		    {
			 st.push(ch);
			 }
			 else if(ch==')'||ch=='}'||ch==']')
			 {
			     if(st.size()==0)
			     {
				    System.out.println("");
				  }
				   else if (
				                       (ch==')'&&st.peek()!='(')||
				                       (ch=='}'&&st.peek()!='{')||
				                       (ch==']'&& st.peek()!='[' )
                    )
                    {

					  return false;
					 }
					 else
					 {
					  st.pop();
					  }
			 }
		 }
		   if(st.size()>0)
		   {
			 return false;
			}
		 return true;
    }

}
