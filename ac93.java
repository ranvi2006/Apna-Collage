// BACKTRACKING

class Backtracking
{
public static void main(String args[])
{
int arr[]=new int[5];
putData(arr,0);

printArr(arr);
}

public static void putData(int arr[],int index)
{
//Base Class
if(index==arr.length)
{
printArr(arr);
return;
}

// work
arr[index]=index+1;

putData(arr,index+1);
arr[index]=arr[index]-2;
}

public static void printArr(int arr[])
{

for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println();
}

}