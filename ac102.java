import java.util.ArrayList;

class ArrayLists
{
public static void main(String args[])
{
ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
ArrayList<Integer>l1=new ArrayList<>();
ArrayList<Integer>l2=new ArrayList<>();
ArrayList<Integer>l3=new ArrayList<>();
for(int i=1;i<=5;i++)
{
l1.add(i);
l2.add(i*2);
l3.add(i*3);
}
mainList.add(l1);
mainList.add(l2);
mainList.add(l3);

for(int i=0;i<mainList.size();i++)
{
ArrayList<Integer>currList=mainList.get(i);
System.out.println(currList);

}


}
}