import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner(System.in);

        String exp = scn.nextLine();

        System.out.println(Balance(exp));
    }

    public static boolean Balance(String str)
    {
		 for(int i=0;i<str.length();i++)
		 {
			 char ch=str.charAt(i);
			 if(ch=='('||ch=='{'||ch=='[')
			 {
				 st.push(ch);
			 }
			 else if(st.peek()==')'&&)
				     {
					 }

			 }
		 }
    }

}
