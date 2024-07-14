class DiagonalSum
{
public static void main(String args[])
{

int arr[][]={
{1, 2, 3,6},
{4, 5, 6,3},
{7, 8, 9,6},
{1,2,3,4}
};
int diagonalSum=findDiagonalSum(arr);
System.out.println("Diagonal sum is "+diagonalSum);
}

public static int findDiagonalSum(int arr[][])
{
int primaryDiagonal=0;
for(int i=0;i<arr.length;i++)
{
primaryDiagonal+=arr[i][i];
}
int n=0;
int m=arr.length-1;
 int secoundaryDiagonal=0;
while(n<arr.length && m>=0)
{
secoundaryDiagonal+=arr[n][m];
System.out.println(secoundaryDiagonal);
n++;
m--;
}

if(arr.length%2==0)
{
System.out.println(primaryDiagonal+" "+secoundaryDiagonal);
return primaryDiagonal+secoundaryDiagonal;
}
if(arr.length%2!=0)
{
int r=arr.length/2;
System.out.println(primaryDiagonal+" "+secoundaryDiagonal+" "+arr[r][r]);
return (primaryDiagonal+ secoundaryDiagonal)-arr[r][r];

}
return 0;

}


}
