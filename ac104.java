// PAIR Sum

import java.util.ArrayList;

class ArrayLists
{
public static void main(String args[])
{
int target=6;
ArrayList<Integer>list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
list.add(7);
list.add(8);
list.add(9);
list.add(10);

System.out.print(pairSum(list,target));

}

public static boolean pairSum(ArrayList<Integer>list,int target)
{
for(int i=0;i<list.size();i++)
{
if(list.get(i)>=target)
{
System.out.println("1");
return false;
}
for(int j=i+1;j<list.size();j++)
{
System.out.println("("+list.get(i)+" , "+list.get(j)+")");
if(list.get(i)>=target)
{
System.out.println("break");
break;
}
if(list.get(i)>=target)
{
return false;
}
if(list.get(i)+list.get(j)==target)
{
System.out.println("("+list.get(i)+" , "+list.get(j)+")");
return true;
}

}

}
return false;
}

}