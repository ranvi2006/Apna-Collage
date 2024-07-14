//SELECTION SORT INCREASING

class Sorting
{
public static void main(String args[])
{
int arr[]={76,75,74,73,72};
sortInc(arr);

}

public static void sortInc(int arr[])
{
int index=0;
int data=0;

for(int i=0;i<arr.length;i++)
{
data=arr[i];

for(int j=i;j<arr.length;j++)
{
if(data>=arr[j])
{
data=arr[j];
index=j;

}

}
int tem=arr[i];

arr[i]=arr[index];

arr[index]=tem;




}

}
}