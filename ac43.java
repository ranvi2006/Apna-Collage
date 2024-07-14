class Pairs
{
public static void main(String args[])
{
int arr[]={2,4,6,8,10};
pairs(arr);
}
//---------------------

public static void pairs(int arr[])
{
if(arr.length==1||arr.length==0)
{
return;
}

for(int i=0;i<arr.length;i++)
{
for(int j=i;j<arr.length;j++)
{
if(i==j)
{
continue;
}
System.out.print("("+arr[i]+" , "+arr[j]+")  ");

}
System.out.println();

}

}
}