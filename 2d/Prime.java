class Prime {
 public static void main(String aaa[])
 {
  int a[]={1,5,2,4,1};
  int y=minOperations(a);
  System.out.println("====="+y);
 }
    public static int minOperations(int[] a)
    {

        int count=0;
        for(int i=0;i<a.length-1;i++)
        {
		  int prev=i;
        int curr=i+1;
       System.out.println("a[prev] "+a[prev]+"a[curr]"+a[curr]);
            if(a[curr]==a[prev])
            {
                int v1=a[curr];
                v1=v1+1;
                a[curr]=v1;
            }
            else if(a[curr]<a[prev])
            {
                int plus=0;

                 int v2=0;
                while(a[prev]>a[curr])
                {
				  v2=a[curr];

                    v2=v2+1;


                    plus++;

                }
                a[curr]=v2;

                count+=plus;

                    System.out.println("Plus="+plus);


            }
        }

        for(int i=0;i<a.length;i++)
        {
             System.out.println(a[i]);
        }
        return count;
    }
}
