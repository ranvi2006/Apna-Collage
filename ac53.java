//SELECTION SORT DECREASING

class Sorting
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5,6};
sortDec
(arr);

}

public static void sortDec(int arr[])
{
int index=0;
int data=0; 

for(int i=0;i<arr.length;i++)
{
data=arr[i];

for(int j=i;j<arr.length;j++)
{
if(data<=arr[j])
{
data=arr[j];
index=j;

}

}
int tem=arr[i];
System.out.println("tem=arr[i] = "+tem);
arr[i]=arr[index];
System.out.println("arr[i]=arr[index] = "+arr[index]);
arr[index]=tem;
System.out.println("arr[index]=tem = "+arr[i]);

for(int k=0;k<arr.length;k++)
{
System.out.print(arr[k]+" ");
}
System.out.println();

}

}
}