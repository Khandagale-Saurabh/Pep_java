import java.util.*;
class hasmapintro
{
  public static void main(String aa[])
  {

   ArrayList<String> a1=new ArrayList<>();
   a1.add("a");
   a1.add("a");a1.add("b");a1.add("c");
   a1.add("v");a1.add("v")
   ;
   a1.add("v");a1.add("v");
   a1.add("v");a1.add("v");
   freq(a1);
  }

  public static void freq(ArrayList<String> a1)
  {



  HashMap<String,Integer> h1=new HashMap<>();

  for(String s:a1)
    {
		if(h1.containsKey(s))
		{
			int val=h1.get(s);
			val++;
   	     h1.put(s,val);
	    }
	    else
	    {
			h1.put(s,1);
	     }

    }

System.out.println(h1);
  }
}
