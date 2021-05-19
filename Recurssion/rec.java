import java.util.*;
class rec
{
  public static void main(String aaa[])
  {
    Scanner sc=new Scanner(System.in);
     //nt n=sc.nextInt();

      //inc(5);
      int y=pow1(5,5);
      System.out.println(y);
  }
  /*
   5
   4
   3
   2
   1
   5*5
  */

  public static  int pow1(int x,int n)
  {
    if(n==1)
    {
	  return x;
	 }
	 int ret=pow1(x,n-1);
	 int ans=x*ret;
	 return ans;
  }
}
