import java.util.ArrayList;

class PairSum
{
public static void main(String args[])
{
int target=26;

ArrayList<Integer>list=new ArrayList<>();
list.add(11);
list.add(15);
list.add(6);
list.add(8);
list.add(9);
list.add(10);

int max=list.get(0);
int min=list.get(0);
int maxi=0;
int mini=0;


for(int i=0;i<list.size();i++)
{

int n=list.get(i);
if(n>max)
{
max=n;
maxi=i;
}
if(n<min)
{
min=n;
mini=i;
}

}

System.out.println(pairSum(list,target,maxi,mini));

}

public static boolean pairSum(ArrayList<Integer>list,int target,int rp,int lp)
{

while(lp!=rp)
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
if(lp+1==list.size())
{
lp=0;
}
if(rp-1==-1)
{
rp=list.size()-1;
}



}
return false;

}

}