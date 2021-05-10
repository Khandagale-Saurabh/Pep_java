import java.util.*;
class INTRO
{
    public static class  edge
    {
        int src,des,cost;
         edge(int s,int d,int c)
         {
            src=s;
            des=d;
            cost=c;
         }
           public String toString()
		     {
		         return src+" ==>  "+des+" ==> "+cost;
              }
    }
    //edge create kiya;

    public static void main(String aaa[])
    {
    ArrayList<edge> grp[]=new ArrayList[7];
    for(int i=0;i<grp.length;i++)
    {
         grp[i]=new ArrayList();
    }
    grp[0].add(new edge(0,1,10));
    grp[0].add(new edge(0,3,40));

    grp[1].add(new edge(1,0,10));
    grp[1].add(new edge(1,2,10));
for(int idx = 0 ; idx < grp.length ; idx++){
            System.out.println(idx +"-->"+grp[idx]);
        }
    }

}

