import java.util.*;
class rec
{
  public static void main(String aaa[])
  {
    Scanner sc=new Scanner(System.in);
     //nt n=sc.nextInt();

      //inc(5);
      //int y=pow1(5,5);
      //System.out.println(y);
     // inc(5);
      zig(2);
  }


 public static  void inc(int n)
   {
     if(n==0 )
     {     return;
     }
        inc(n-1);
        System.out.println(n);
        // inc(n-1);
   }

public  static void zig(int n)
    {
	   if(n==0)
	   {
		 return;
		}
		System.out.println("Pre"+n); //1
		zig(n-1);                    //2
		System.out.println("In"+n);  //3
		zig(n-1);                    //4
		System.out.println("Post"+n);//5
	}



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
