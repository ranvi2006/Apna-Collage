class Recursion
{
public static void main(String args[])
{
int arr[]={3,53,5,64,2,5,8,4,5};
int target=5;
int lastIndex=-1;
int index=findLastOccurense(arr,target,0,lastIndex);
System.out.println("target hited at index "+index);

}

public static int findLastOccurense(int arr[],int target,int st,int last)
{

if(st==arr.length)
{
System.out.println("raju");
return last;
}
if(arr[st]==target)
{
last=st;

}
 
return findLastOccurense(arr,target,st+1,last);


}

}