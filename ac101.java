// ARRAYLIST
import java.util.ArrayList;
import java.util.Collections;
class ArrayLists
{
public static void main(String args[])
{
int idx1=2;
int idx2=3;
ArrayList<Integer>list=new ArrayList<>();
list.add(7);
list.add(8);
list.add(9);
list.add(2);
list.add(0);
System.out.println(list);
//swap
int tem=list.get(idx1);
list.set(idx1,list.get(idx2));
list.set(idx2,tem);

System.out.println(list);
Collections.sort(list);
System.out.println(list);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);

}
}