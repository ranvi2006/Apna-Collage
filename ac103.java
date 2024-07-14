import java.util.ArrayList;

class ArrayLists
{
public static void main(String args[])
{
ArrayList<Integer>hight=new ArrayList<>();
hight.add(20);hight.add(8);hight.add(6);hight.add(2);hight.add(5);hight.add(4);hight.add(20);hight.add(3);hight.add(7);
System.out.println(hight);

ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
System.out.println(mainList);

for(int i=0;i<hight.size()-1;i++)
{
waterHight(mainList,hight,i);
}
System.out.println("MIANLIST "+mainList);

System.out.println("maximum water stored  "+maxWater(mainList));
}


public static void waterHight(ArrayList mainList,ArrayList hight,int si)
{
ArrayList<Integer>currList=new ArrayList<>();
int width=0;
 int height=0;
for(int i=si+1;i<hight.size();i++)
{
width++;
int x=(int)hight.get(si);
int y=(int)hight.get(i);
if(x>=y)
{
height=y;
}
else
{
height=x;
}
System.out.println(height+"  "+width);
int water=width*height;
currList.add(water);

}
mainList.add(currList);
}

public static int maxWater(ArrayList<ArrayList<Integer>> mainList)
{
int maxValue=0;
int si=0;
int ei=0;
int k=0;
for(int i=0;i<mainList.size();i++)
{
k++;
ArrayList<Integer>tempList=mainList.get(i);


for(int j=0;j<tempList.size();j++)
{

if(tempList.get(j)>=maxValue)
{

int data=tempList.get(j);
maxValue=tempList.get(j);
si=i;
ei=j+k;
}

}

}
System.out.println("the maximum water can be stored at index ("+si+" ,"+ei+")");
return maxValue;

}

}