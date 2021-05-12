import java.io.*;
import java.util.*;
// 2+3*3
public class Infix{


public static void main(String[] args) throws Exception 
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack<Integer> Number_wala_stck=new Stack<>();
    Stack<Character> operation_wala_stck=new Stack<>();
    for(int i=0;i<exp.length();i++)
    {
	  char ch=exp.charAt(i);// 2+4*7

	   if(ch=='(')
	   {
		operation_wala_stck.push(ch);
		}
		else if(Character.isDigit(ch))
		{
		  Number_wala_stck.push(ch-'0');//+,*....
		 }
	  else if(ch==')')//(2*7+3)
		{
		  while(operation_wala_stck.peek()!='(')
		  {
		   	 char ch1=operation_wala_stck.pop();
		   			 int val2=Number_wala_stck.pop();
		   			 int val1=Number_wala_stck.pop();
		   			 int v=opeartion(val1,val2,ch1);
			 Number_wala_stck.push(v);
		   }
		   operation_wala_stck.pop();
		 }

		else  if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
		 	   {
		 		   while(operation_wala_stck.size()>0 &&operation_wala_stck.peek()!='(' && precedences(ch)<=precedences(operation_wala_stck.peek()))
		 		   {
		 			 char ch1=operation_wala_stck.pop();
		 			 int val2=Number_wala_stck.pop();
		 			 int val1=Number_wala_stck.pop();
		 			 int v=opeartion(val1,val2,ch1);
		 			 Number_wala_stck.push(v);
		 		   }
		 		   operation_wala_stck.push(ch);
		}

	}
	while(operation_wala_stck.size()!=0)
			 {
			   char cch=operation_wala_stck.pop();
			   		     int val2=Number_wala_stck.pop();
			   		     int val1=Number_wala_stck.pop();
			   		     int opv=opeartion(val1,val2,cch);
			   		     int y=opeartion(val1,val2,cch);
			     Number_wala_stck.push(y);
		  }
		  System.out.println(Number_wala_stck.peek());
 }

 public static int precedences(char op)
 {
   if(op=='+')
   {
	 return 1;
	}else if(op=='-')
       {
		 return 1;
		}
		else if(op=='*')
		{
		return 2;

		 }else{
		  // divide
		  return 2;}
  }

		public static int  opeartion(int val1, int val2, char op)
		{
			if(op=='+' )
			{
				return val1+val2;

			}
			else if(op=='-')
			{
				return val1-val2;
				}else if(op=='*')
				{
				return val1*val2;

				}else
				{
				return val1/val2;

				}
		}

}
