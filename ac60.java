class Main
{
public static void main(String args[])
{
int target=7;

int arr[]={0,1,2,4,5,6,7};
int copyArr[]=new int [arr.length];
rotate(arr,copyArr);
int place=hitTarget(copyArr,target);
System.out.println(place );

}

public static void  rotate(int arr[] ,int copyArr[])
{
int data=0;
int index=0;
for(int i=0;i<arr.length-1;i++)
{
data=arr[i];
if(arr[i+1]-arr[i]!=1)
{
index=i+1;

}
}
int idx=0;
for(int i=index;i<arr.length;i++)
{
copyArr[idx]=arr[i];
idx++;
}

for(int i=0;i<index;i++)
{
copyArr[idx]=arr[i];
idx++;
}


}
public static int hitTarget(int copyArr[], int  target)
{
for(int i=0;i<copyArr.length;i++)
{
if(copyArr[i]==target)
{
return i;
}

}
return -1;
}
}