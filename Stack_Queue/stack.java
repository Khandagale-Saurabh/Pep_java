class stack<T>
{
T data[];
int tos;
stack(int tos)
{
  data=(T[])new Object[tos];
  tos=-1;
}
void display()
{
 for(int i=tos;i>=0;i--)
 {
  System.out.println(data[i]);
 }
}
void push(T ele)
{
 if(tos==data.length-1)
 {
  T new_data[]=(T[])new Object [data.length*2];
  for(int i=tos;i>=0;i--)
   {
	new_data[i]=data[i];
   }
    data=new_data;
      tos++;
  data[tos]=ele;
  }
  else{
  tos++;
  data[tos]=ele;
    }
}
T pop()
{
  T val=data[tos];
  tos--;
  return val;
}
int size()
{return(tos+1);
}
  public static void main(String aa[])
  {
  stack<Integer> s1=new stack<>(4);
  s1.push(10);
  s1.push(20);
  s1.push(30);
  s1.push(10);
    s1.push(20);
  s1.push(30);
    s1.display();
   int y=s1.size();
   System.out.println(""+y);



stack<String> s2=new stack<>(4);
  s2.push("Sai");
  s2.push(""+20);
  s2.push(""+30);
  s2.push(10+"");

    s2.display();
   int y1=(int)s2.size();
   System.out.println(""+y1);
  }
}
