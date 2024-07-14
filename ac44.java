class Pairs
{
public static void main(String args[])
{
int arr[]={2,4,6,8,10,12,14};
subArray(arr);
}
//---------------------

public static void subArray(int arr[])
{
for(int i=0;i<arr.length;i++)
{

for(int j=i;j<arr.length;j++)
{
System.out.print("[");
for(int k=i;k<=j;k++)
{
System.out.print(arr[k]);
if(k<j)
{
System.out.print(",");
}
}
System.out.print("]  ");
}
System.out.println();
}

}
}