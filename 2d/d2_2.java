import java.util.*;
class d2_2
{
  public static void main(String aa[])
  {
  Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int a[][]=new int[n][m];
  // System.out.println("=====================");
   input(a,n,m);

  	 		 System.out.println("================");
   question1(a);

  	 		 System.out.println("================");
   transpose(a,n,m);


  }

  public static void question1(int a[][])
  {
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<a[i].length;j++)
		  {
			  System.out.print(a[i][j]+" ");
		  }

			  System.out.println();
	  }

  }

   public static void input(int a[][],int n,int m)
    {
		Scanner sc=new Scanner(System.in);
  	  for(int i=0;i<a.length;i++)
  	  {
  		  for(int j=0;j<a[i].length;j++)
  		  {
  			 a[i][j]=sc.nextInt();
  		  }
  	  }

  	}
  	public static void transpose(int a[][],int n,int m)
  	{
	 int a2[][]=new int[m][n];
	     for(int i=0;i<a.length;i++)
	     	  {
	     		  for(int j=0;j<a[i].length;j++)
	     		  {
	     			 a2[i][j]=a[j][i];
	     		  }
  	 		 }
  	 		 System.out.println("================");
	question1(a2);
	}
}
