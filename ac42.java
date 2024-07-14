class Reverse
{
public static void main(String args[])
{
int arr[]={1,2,3,6,3,0,8};

Reverse(arr);

for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" " );
}

}

public static void Reverse(int arr[])
{
int st=0;
int mid=arr.length/2;
int end=arr.length-1;

for(int i=0;i<=mid;i++)
{
int dub=arr[st];
arr[st]=arr[end];
arr[end]=dub;
st++;
end--;
}

}
}