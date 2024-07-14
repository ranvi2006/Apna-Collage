import java.util.Scanner;
class Sorting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[][]={
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
//for(int i=0;i<arr.length;i++)
//{
//for(int j=0;j<arr[0].length;j++)
//{

//arr[i][j]=sc.nextInt();
//}
//}
int left=0;//j
int right=arr[0].length-1;// jth
int down=0;// i
int up=arr.length-1;//ith

while(left<right && up>down)
{
for(int i=left;i<=right;i++)
{
// left ---------
System.out.print(arr[left][i] +" ");
}
down++;
System.out.println();


//----down
for(int i=down;i<=up;i++)
{
System.out.print(arr[i][right]+" ");
}
right--;

System.out.println();
// right -------

for(int i=right;i>=left;i--)
{
System.out.print(arr[up][i]+" ");
}
up--;
System.out.println();
// up-----------------


for(int i=up;i>=down;i--)
{
System.out.print(arr[i][left]+" ");
}
left++;
System.out.println();

}

}
}