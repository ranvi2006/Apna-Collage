//Suduko
class Sudoko
{
public static void main(String args[])
{
int sudoku[][]={
          {5, 0, 0, 0, 7, 8, 0, 1, 0},
          {6, 0, 2, 1, 0, 5, 3, 0, 8},
          {1, 0, 8, 0, 4, 2, 5, 6, 0},
          {8, 5, 9, 7, 6, 1, 0, 2, 3},
          {0, 2, 0, 0, 5, 3, 7, 9, 0},
          {7, 1, 3, 9, 2, 0, 8, 0, 6},
          {0, 0, 0, 0, 3, 7, 2, 8, 4},
          {2, 8, 7, 0, 1, 0, 0, 3, 0},
          {3, 4, 0, 2, 0, 6, 1, 7, 0}};

if(sudokuSolver(sudoku,0,0))
{
printSudoku(sudoku);

}

}

public static boolean sudokuSolver(int sudoku[][],int row,int col)
{

if(row==9)
{
return true;
}

int nextRow=row;
int nextCol=col+1;
if(col+1==9)
{
nextRow++;
nextCol=0;
}

if(sudoku[row][col]!=0)
{
 return sudokuSolver(sudoku,nextRow,nextCol);
}

for(int digit=1;digit<=9;digit++)
{
if(isSafe(sudoku,row,col,digit))
{
sudoku[row][col]=digit;
if(sudokuSolver(sudoku,nextRow,nextCol))
{
return true;
}
sudoku[row][col]=0;

}

}
return false;

}
//------------------------------
public static boolean isSafe(int sudoku[][],int row,int col,int digit)
{
// row
for(int i=0;i<9;i++)
{
if(sudoku[i][col]==digit)
{
return false;
}
}

// coloumn

for(int j=0;j<9;j++)
{
if(sudoku[row][j]==digit)
{
return false;
}

}

// for grid
int rst=(row/3)*3;
int red=rst+3;
int cst=(col/3)*3;
int ced=cst+3;



for(int i=rst;i<red;i++)
{
for(int j=cst;j<ced;j++)
{
if(sudoku[i][j]==digit)
{
return false;
}
}
}


// true
return true;

}
//--------------------------------

public static void printSudoku(int sudoku[][])
{
for(int i=0;i<sudoku.length;i++)
{
for(int j=0;j<sudoku[0].length;j++)
{
System.out.print(sudoku[i][j]+" ");

}
System.out.println();

}
System.out.println();

}

}