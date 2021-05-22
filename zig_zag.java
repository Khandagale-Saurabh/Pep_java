class zig_zag
{

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
	public static void toh(int num,int a,int b,int c)
	{
	 if(num==0)
	  {
	    return;
	  }
	   toh(num-1,a,c,b);
	   System.out.println(" "+a +" "+b +" "+c);
	   toh(num-1,c,b,a);
	}

	public static int[] All_idx(int arr[],int n,int s,int fsf)
	{
	   if(s==arr.length)
	   {
		 return new int[fsf];
	   }
	   if(arr[s]==n)
	    {
		 int arr1[]=All_idx(arr,n,++s,fsf+1);
		   arr1[fsf]=s;
		   return arr1;
		 }
      else
      {
	    int arr1[]=All_idx(arr,n,++s,fsf);
	    return arr1;
	   }
	}

 public static void main(String aa[])
  {
    // toh(4,1,3,2);
    int a[]={10,20,30,10,40,50,30,30,30,30,30,30};
    int ans[]=All_idx(a,20,0,0);
    for(int i=0;i<ans.length;i++)
    {
	   System.out.println("idx = "+ans[i]);

	 }
  }
 }
