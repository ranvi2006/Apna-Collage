class PrefixSubArray
{
public static void main(String args[])
{
int arr[]={2,4,6,7,4};
int preArray[]=new int[arr.length];

int k=0;

for(int i=0;i<arr.length;i++)
{
int sum=0;
for(int j=k;j<=i;j++)
{
sum+=arr[j];

}
preArray[i]=sum;

}
System.out.print("arr[]=");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");

}
System.out.println();
System.out.print("preArray[]=");
for(int i=0;i<arr.length;i++)
{
System.out.print(preArray[i]+" ");

}

}

}