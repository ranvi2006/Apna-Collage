class Recursion
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5,4};
if(checkSorted(arr,0,1))
{
System.out.println("yes arr is shorted ");
}
else
{
System.out.println(" array is  not shorted ");
}
}

public static boolean checkSorted(int arr[], int curr,int pre)
{


if(arr[curr]>arr[pre])
{
return false;
}
if(pre==arr.length-1)
{
return true;
}
return checkSorted(arr,curr+1,pre+1);
}
}