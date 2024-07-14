class Trading
{
public static void main(String args[])
{
int stockPrice[]={3,4,7,20,7,9,2};
findMaxProfit(stockPrice);
}

//----------------------------

public static void  findMaxProfit(int stockPrice[])
{
int bp=stockPrice[0]; int minBP=stockPrice[0]; int bd=1;
int sp=stockPrice[0]; int maxSP=stockPrice[0]; int sd=1;
int profit=0; int maxProfit=0;



for(int i=1;i<stockPrice.length;i++)
{
if(bp<stockPrice[i])
{
sp=stockPrice[i];
if(sp>maxSP)
{
maxSP=sp;
sd=i+1;
}
}

if(bp>stockPrice[i] &&)
{
bp=stockPrice[i];
if(bp<minBP)
{
minBP=bp;
bd=i+1;
}
}

}

System.out.println("if you buy the stock in day "+bd+"  and sell in day "+sd+" then you got maximum Profit is "+(maxSP-minBP));

}

}