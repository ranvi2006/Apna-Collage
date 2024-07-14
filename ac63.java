class TwoDArray
{
public static void main(String args[])
{
int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,14},{15,16,17}};

int arr1[][]=new int[arr[0].length][arr.length];

printArr(arr);
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[0].length;j++)
{
arr1[j][i]=arr[i][j];
}
}
printArr(arr1);

}

public static void printArr(int arr[][])
{
for(int i=0;i<arr.length;i++)
{
for(int j=0; j<arr[0].length;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}