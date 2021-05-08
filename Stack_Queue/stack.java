//dynamic stack

class stack
{
int data[];
int tos;
stack(int tos)
{
  data=new int[tos];
  tos=-1;
}
void display()
{
 for(int i=tos;i>=0;i--)
 {
  System.out.println(data[i]);
 }
}
void push(int ele)
{
 if(tos==data.length-1)
 {
  int new_data[]=new int[data.length*2];
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
int pop()
{
  int val=data[tos];
  tos--;
  return val;
}
int size()
{return(tos+1);
}
  public static void main(String aa[])
  {
  stack s1=new stack(4);
  s1.push(10);
  s1.push(20);
  s1.push(30);
  s1.push(10);
    s1.push(20);
  s1.push(30);
    s1.display();
   int y=s1.size();
   System.out.println(""+y);

  }
}
