//INBUILD SORTING INCRESEING ORDER
import java.util.Arrays;
class Sorting
{
public static void main(String arsg[])
{
Integer arr[]={2,8,3,4,9};
Arrays.sort(arr);
printArr(arr);

}

public static void printArr(Integer arr[])
{
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");

}
}

}