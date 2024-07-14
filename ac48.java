import java.util.*;
class TrapWater
{
public static void main(String args[])
{
int width=1;
int bars[]=new int[6];
int trapWater=0;
for(int i=0;i<bars.length;i++)
{
Scanner sc=new Scanner(System.in);
bars[i]=sc.nextInt();
}
int waters[]=new int[bars.length];
findTrapWater(bars,waters,width);

for(int i=0;i<waters.length;i++)
{
System.out.print(waters[i]+" ");
trapWater+=waters[i];
}
System.out.println();
System.out.println("the bars trap water is = "+trapWater);


}

//-----------------------
public static void findTrapWater(int bars[] ,int waters[],int width)
{
int arr[]=bars;

for(int i=0;i<bars.length;i++)
{
int index=i;
int values=minBar(arr,index);
if(values<=bars[i])
{
waters[i]=0;
}
else
{
waters[i]=values-bars[i]*width;
}
}
}

//-----------------------------------
public static int minBar(int arr[],int index)
{
int leftValue=0;
int rightValue=0;
//---
for(int i=index;i>=0;i--)
{
if(leftValue<=arr[i])
{
leftValue=arr[i];
}
}
//---
for(int i=index;i<arr.length;i++)
{
if(rightValue<=arr[i])
{
rightValue=arr[i];
}
}
//----

return Math.min(leftValue,rightValue);

}


}