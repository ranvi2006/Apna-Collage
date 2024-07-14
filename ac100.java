// ARRAYLIST
import java.util.ArrayList;
class ArrayLists
{
public static void main(String args[])
{
ArrayList<Integer>list=new ArrayList<>();
list.add(7);
list.add(8);
list.add(9);
list.add(2);
list.add(0);
System.out.println(list);
int max=Integer.MIN_VALUE;
System.out.println(max);
for(int i=list.size()-1;i>=0;i--)
{
if(list.get(i)>=max)
{
max=list.get(i);
}
}
System.out.println(max);

}

}