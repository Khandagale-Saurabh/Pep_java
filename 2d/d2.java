import java.util.*;
class d2
{
  public static void main(String aa[])
  {
  Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int a[][]=new int[n][m];
  // System.out.println("=====================");

   question1(a);
  }
   public static void   question1(int a[][])
   {
	    Scanner sc=new Scanner(System.in);
     for(int i=0;i<a.length;i++)
      {
         for(int j=0;j<a[0].length;j++)
         {
            a[i][j]=sc.nextInt();
         }
      }

int n=a.length;
int m=a[0].length;
int a11[][]=new int[m][n];

           for(int i=0;i<a[0].length;i++)//m
            {System.out.print("[");
               for(int j=0;j<a.length;j++)//n
               {
				   a11[i][j]=a[j][i];
                 System.out.print(a[j][i]+" ");
               }
               System.out.print("]");
                  System.out.println();

      		}

System.out.print("=================================");
      		for(int i=0;i<a11.length;i++)
			      {
			         for(int j=0;j<a11[0].length;j++)
			         {
			 				System.out.print(a11[i][j]+" ");
			          }

			 				System.out.println();
     			 }
   }


}
