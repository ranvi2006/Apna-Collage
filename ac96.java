// BACKTRACKING
// Possible way to put the queen in nth row in chess board

class NQueens
{
static int way=0;
public static void main(String args[])
{
int n=5;
char chessBoard[][]=new char[n][n];
for(int i=0;i<chessBoard.length;i++)
{
for(int j=0;j<chessBoard[0].length;j++)
{
chessBoard[i][j]='.';
}
}
nQueens(chessBoard,0);
System.out.println("there are "+way+" way to put the quees in chessBoard");
}

//---------------------

public static void nQueens(char chessBoard[][],int row)
{
//Base case
if(row==chessBoard.length)
{
printChessBoard(chessBoard);
way=way+1;
return;
}
//j cloumn

for(int cloumn=0;cloumn<chessBoard[0].length;cloumn++)
{
if(isSafe(chessBoard,row,cloumn))
{
chessBoard[row][cloumn]='Q';
nQueens(chessBoard, row+1);
chessBoard[row][cloumn]='.';
}
}

}
//----------------------
public static boolean isSafe(char chessBoard[][],int row,int cloumn)
{
// vartical up
for(int i=row-1;i>=0;i--)
{
if(chessBoard[i][cloumn]=='Q')
{
return false;
}
}

// vertical left up

for(int i=row-1,j=cloumn-1;i>=0 && j>=0;i--,j--)
{
if(chessBoard[i][j]=='Q')
{
return false;
}

}


// vertical right up
for(int i=row-1,j=cloumn+1;i>=0 && j<chessBoard[0].length;i--,j++)
{
if(chessBoard[i][j]=='Q')
{
return false;
}

}


return true;
}

//----------------------
public static void printChessBoard(char ch[][])
{
for(int i=0;i<ch.length;i++)
{
for(int j=0;j<ch[0].length;j++)
{
System.out.print(ch[i][j]+" ");
}
System.out.println();
}
System.out.println();
}




}
