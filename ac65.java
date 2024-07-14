class Strings
{
public static void main(String args[])
{
String str="WNEENESENNNSSSSS";
findSortestDistance(str);

}
public static void findSortestDistance(String str)
{
int east=0;
int west=0;
int north=0;
int south=0;

for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='E')
{
east++;
west--;
}
else if(str.charAt(i)=='W')
{
east--;
west++;
}
else if(str.charAt(i)=='N')
{
south--;
north++;
}
else if(str.charAt(i)=='S')
{
north--;
south++;
}


}

if(east>=0 && north>=0)
{
System.out.println(" Sortest distance is "+Math.sqrt((north*north)+(east*east)) +"  in the side on east-north");
}
else if(east>=0 && south>=0)
{
System.out.println(" Sortest distance is "+Math.sqrt((south*south)+(east*east)) +"  in the side on east-south");
}
else if(west>=0 && south>=0)
{
System.out.println(" Sortest distance is "+Math.sqrt((south*south)+(west*west)) +"  in the side on west-south");
}
else if(west>=0 && north>=0)
{
System.out.println(" Sortest distance is "+Math.sqrt((north*north)+(west*west)) +"  in the side on west-north");
}

}



}