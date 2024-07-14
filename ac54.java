//INSERTION SORT INCREASING
import java.util.*;
class Sorting
{
public static void main(String args[])
{
int arr[]={5,4,23,7,8};
sortInc(arr);
printArr(arr);
}

public static void sortInc(int arr[])
{
for(int i=1;i<arr.length;i++)
{
int curr=arr[i];
int prev=i-1;
while(prev>=0 &&arr[prev]>curr)
{

arr[prev+1]=arr[prev];
prev--;
}
arr[prev+1]=curr;
}


}

public static void printArr(int arr[])
{
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");

}

}

}