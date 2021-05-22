import java.util.*;
class Subsequence
{
  public static void main(String aaa[])
   {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();

      System.out.println(""+gss(str));

   }

   public static  ArrayList<String> gss(String str)
   {
	 if(str.length()==0)
	 {
	  ArrayList<String> a11=new ArrayList<>();
	   a11.add(" ");
	   return a11;
	  }

     char ch=str.charAt(0);
     String sub_str=str.substring(1);
     ArrayList<String> result=gss(sub_str);
     ArrayList<String> ans=new ArrayList<String>();
     for(String tvse:result)
     {
	  ans.add(""+tvse);
	  ans.add(ch+tvse);
	 }
	 return ans;
   }
}
