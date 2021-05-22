import java.util.*;
class Path
{
  public static void main(String aaa[])
   {
      Scanner sc=new Scanner(System.in);
      int str=sc.nextInt();

      System.out.println(""+gPath(str));

   }

/*
 |0|=>[.]
 |1|===[1]
 |2|====[11]
 |3|=====[111]
 |4|======[1111]
*/
   public static  ArrayList<String> gPath(int str)
   {
	 if(str==0)
	 {
	   ArrayList<String> a1=new ArrayList();
	   a1.add("");
	   return a1;
	  }
	  else if(str<0)
	  {
	     ArrayList<String> a1=new ArrayList();
	      return a1;
	   }

	ArrayList<String> p1=gPath(str-1);
	ArrayList<String> p2=gPath(str-2);

	ArrayList<String> ans_path=new ArrayList<String>();

	for(String ss:p1)
	  {
	     ans_path.add(1+ss);

	  }
	  for(String ss:p2)
	  	  {
	  	     ans_path.add(2+ss);

	  }
	  return ans_path;
   }
}
