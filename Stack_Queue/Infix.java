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
		System.out.println("=========");
		}
		else if(Character.isDigit(ch))
		{
		  Number_wala_stck.push(ch-'0');//+,*....
		 }
	  else if(ch==')')//(2*7+3)
		{
		  while(operation_wala_stck.peek()!='(')
		  { 
			   int v=0;
					  int val1=0;
					  int  val2=0;
					  char ch1=' ';
			  fun( ch1, val2 , val1, v, Number_wala_stck,operation_wala_stck);
		   }
		   operation_wala_stck.pop();
		 }

		else  if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
		 	   {
		 		   while(operation_wala_stck.size()>0 &&operation_wala_stck.peek()!='(' && precedences(ch)<=precedences(operation_wala_stck.peek()))
		 		   {
		 			 //fun();
					  int v=0;
					  int val1=0;
					  int  val2=0;
					  char ch1=' ';
					  fun( ch1, val2 , val1, v, Number_wala_stck,operation_wala_stck);
		 		   }
		 		   operation_wala_stck.push(ch);
		       }

	}
	     while(operation_wala_stck.size()!=0)
			 {
			     int v=0;
					  int val1=0;
					  int  val2=0;
					  char ch1=' ';
					  fun( ch1, val2 , val1, v, Number_wala_stck,operation_wala_stck);
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

  			public static  void  fun(char ch1, int val2 ,int val1, int v, Stack<Integer>  Number_wala_stck,Stack<Character> operation_wala_stck)
 				 {
	   				 ch1=operation_wala_stck.pop();
		 			  val2=Number_wala_stck.pop();
		 			  val1=Number_wala_stck.pop();
		 			  v=opeartion(val1,val2,ch1);
		 			 Number_wala_stck.push(v);
 				 }

}

