class TwoDArray
{
public static void main(String args[])
{
int arr[][]={{4,7,8},{8,8,7}};
int numbers=0;
int target=7;
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[0].length;j++)
{
if(arr[i][j]==target)
{
numbers++;
}
}
}
System.out.println("output- "+numbers);
}

}