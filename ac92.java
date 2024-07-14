class Recurision
{
public static void main(String args[])
{
int arr[]={2, 3, 4, 5, 6};
System.out.println("Inversion count is "+inversionCount(arr));

}

public static int inversionCount(int arr[])
{
int inversion=0;
for(int i=0;i<arr.length;i++)
{
for(int j=i;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
System.out.print("("+arr[i]+" , "+arr[j]+")");
inversion++;
}
}


}
System.out.println();
if(inversion==0)
{
System.out.println("because all the elements of the array are the same & already in a sorted OR because the array is already sorted");
}
return inversion;
}

}