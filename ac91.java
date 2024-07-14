//MERGE SORT
class Shorting 
{
public static void main(String args[])
{
int arr[]={1,3,4,2,6,20};
mergeSort(arr,0,arr.length-1);

System.out.println("Raju");
printArr(arr);


}
public static void mergeSort(int arr[],int si ,int ei)
{

if(si>=ei)
{
return;
}
int mid=si+(ei-si)/2;

mergeSort(arr,si,mid);
mergeSort(arr,mid+1,ei);
merge(arr,si,mid,ei);

}
//------------------------------
public static void merge(int arr[],int si,int mid,int ei)
{

System.out.println(" si "+si+" mid "+mid+" ei "+ei);
int temp[]=new int[ei-si+1];
int i=si;
int j=mid+1;
int k=0;

while(i<=mid&&j<=ei)
{
if(arr[i]<=arr[j])
{
temp[k++]=arr[i++];

}
else
{
temp[k++]=arr[j++];

}

}

// left part
while(i<=mid)
{
temp[k++]=arr[i++];
}
// right part
while(j<=ei)
{
temp[k++]=arr[j++];
}


// to copy temp array to array

for(int y=0,x=si;y<temp.length;y++,x++)
{

arr[x]=temp[y];

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