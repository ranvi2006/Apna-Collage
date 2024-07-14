class sumSubArray
{
public static void main(String arsg[])
{
int arr[]={2,4,5,6,3,6};


for(int i=0;i<arr.length;i++)
{
for(int j=i;j<arr.length;j++)
{
int sum=0;
System.out.print("[");
for(int k=i;k<=j;k++)
{
System.out.print(arr[k]);
if(k!=j)
{
System.out.print(",");
}
sum=sum+arr[k];

}
System.out.print("]");
System.out.print(" = "+sum);
System.out.println();

}
System.out.println();


}

}


}