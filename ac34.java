import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter day at GMT format");
int day=sc.nextInt();
System.out.println("Enter hour at GMT format");
int hour=sc.nextInt();
System.out.println("Enter minute at GMT format");
int minute=sc.nextInt();

if((minute+30)>59)
{
minute=(minute+30)-60;
hour++;
}
else
{
minute=minute+30;
}

if((hour+5)>23)
{
hour=(hour+5)-24;
day++;
}
else
{
hour=hour+5;
}

if(day>29)
{
day=day-30;
}

System.out.println("Day :--  "+day);
System.out.println("Hour :--  "+hour);
System.out.println("Minutes :--  "+minute);

}



}