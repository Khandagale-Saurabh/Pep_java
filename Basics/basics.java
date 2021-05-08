import java.util.*;
class  basics
{
  public static void main(String a1a[])
  {
  //  prime(13);
  //  int f=fab(7);

/*
    System.out.println(f);

    System.out.println("Inserse");
    int a[]={2,3,1,0};
     inverse(a);
     gcd(36,24);
     System.out.println("Factor");
     factor(1440);
          System.out.println("Rotate");
          rotate(12345);
          */
       //   Dec_base(634);

//base_base(1172,8);
base_Addition(236,754,8);
  }
public static void  base_Addition(int n1,int n2,int b)
{
   int c=0;
    int p=0;   int ans=0;
   while(n1>0||n2>0||c>0)
   {
	  int d1=n1%10;
	  int d2=n2%10;
	  n1=n1/10;
	  n2=n2/10;
	  int d=d1+d2+c;
	  c=d/b;
	  d=d%b;
	  ans+=Math.pow(10,p)*d;
	  p++;
   }
   System.out.println(ans);
}
public static void base_base(int n,int b)
{
 int ans=0;
 int i=0;
  while(n!=0)
  {
    int dig=n%10;
    n=n/10;
    ans+=Math.pow(8,i)*dig;
    i++;
System.out.println(dig);
  }
  System.out.println(ans);
}

public static void Dec_base(int n)
{
 int ans=0;
 int p=0;
String str="";
  while(n!=0)
   {
	int dig=n%8;//2,7,1
	n=n/8;

	ans+=(int)Math.pow(10,p)*dig;
	p++;

   }
   System.out.println(ans);
}

public static void factor(int n)
{
int temp=0;
 for(int i=2;i<=n;i++)
 {

   while(n%i==0)
   {
	 System.out.println(i);
	n=n/i;
   }
 }
}
public static  void gcd(int n1,int n2)
{
 int on1=n1;
 int on2=n2;
 while(n1%n2!=0)
 {
  int rem=n1%n2;//12
   n1=n2;
   n2=rem;
 }
 System.out.println(n2);
 int y=(on1*on2)/n2;
 System.out.println(y);

}
public static void  inverse(int a[])
{
 int n[]=new int[a.length];
   for(int i=0;i<a.length;i++)
   {
	  int temp=a[i];
	  n[temp]=i;

   }

      for(int i=0;i<a.length;i++)
   {

     System.out.println(n[i]);
   }
 }
  // 1 1 2 3 5 8 13
  public static int  fab(int n)
  {
     if(n==0 ||n==1)
     {
	  return n;
	  }
	  if(n==2)
	  {
	   return 1;
	   }
	   int f=fab(n-1)+fab(n-2);
   return f;
  }


  public  static void prime(int n)
  {
  int count=0;
    for(int i=2;i*i<=n;i++)
     {
       if(n%i==0)
       {
         count++;
         break;
       }
     }
     if(count==0)
     {
     System.out.println("Prime");
     }
     else
     {
     System.out.println("Not Prime");

     }
  }

}
