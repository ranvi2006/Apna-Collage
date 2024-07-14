//BUBBLE SORT decreasing
class Sorting
{
public static void main(String args[])
{
int arr[]={2,5,8,4,8,3,5,9};
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}

sortInc(arr);



}
//----------------
public static void sortInc(int arr[])
{
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr.length-i-1;j++)
{
if(arr[j]<arr[j+1])
{
int tem=arr[j];
arr[j]=arr[j+1];
arr[j+1]=tem;
}
}
}
System.out.println();

for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}

}


}