//COUNNTING SORT

class Sorting
{
public static void main(String args[])
{
int arr[]={7,6,5,4,3,2,1};
sortCount(arr);
printArr(arr);
}

public static void sortCount(int arr[])
{
int largest=0;
//-----------------
for(int i=0;i<arr.length;i++)
{
if(largest<=arr[i])
{
largest=arr[i];
}
}
//------------------

int countArr[]=new int[largest+1];

for(int i=0;i<countArr.length;i++)
{
countArr[i]=countNumber(arr,i);
System.out.println(countNumber(arr,i)+" "+i);
}



for(int i=0;i<arr.length;i++)
{
arr[i]=enterData(countArr);
}

}
//-------------------------
public static int countNumber(int arr[],int index)
{
int count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==index)
{
count++;
}

}
return count;

}
// print array -----------------------

public static void printArr(int arr[])
{
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
//----------------------

public static int enterData(int countArr[])
{
int index=0;
for(int i=0;i<countArr.length;i++)
{

if(countArr[i]!=0)
{
index=i;
countArr[i]=countArr[i]-1;
break;

}

}
return index;
}

}