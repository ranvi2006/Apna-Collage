class Recursion
{
public static void main(String args[])
{
int arr[]={1,3,6,3,7,0,3,1,5};
int target=3;
findOccurence(arr,target,0);

}
public static void findOccurence(int arr[],int target,int index)
{
//basecase
if(index==arr.length)
{
return;
}
if(arr[index]==target)
{
System.out.print(index+" ");
}

// function call
findOccurence(arr,target,index+1);
}

}