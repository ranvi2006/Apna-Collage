// NextGreater
import java.util.Stack;
class Stacks
{
public static void main(String args[])
{
int arr[]={6,2,0,3,1,5,4};
int nextGreater[]=new int[arr.length];
Stack<Integer>s=new Stack<>();
s.push(1);
for(int i=arr.length-1;i>=0;i--)
{
while(!s.isEmpty() &&arr[i]>=s.peek())
{
s.pop();
}

if(s.isEmpty())
{
nextGreater[i]=-1;
}
else
{
nextGreater[i]=s.peek();
}

s.push(arr[i]);


}
for(int i=0;i<nextGreater.length;i++)
{
System.out.print(nextGreater[i]+" ");
}
}
}