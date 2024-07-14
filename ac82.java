class Recursion
{
public static void main(String args[])
{
int arr[]={3,53,5,64,2,5,8,9};
int target=5;
int index=findFirstOccurense(arr,target,0);
System.out.println("target hited at index "+index);

}

public static int findFirstOccurense(int arr[],int target,int st)
{
if(st==arr.length-1)
{
return -1;
}
if(arr[st]==target)
{
return st;
}
 
return findFirstOccurense(arr,target,st+1);


}

}