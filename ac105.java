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
int lp=0;
int rp=list.size()-1;
while(lp<rp)
{
int n=list.get(lp)+list.get(rp);
if(n==target)
{
System.out.println("("+list.get(lp)+" , "+list.get(rp)+")");
return true;
}
if(n>target)
{
rp--;
}
if(n<target)
{
lp++;
}

}

return false;
}

}