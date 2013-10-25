/*
  Make a Function that forms make squares of size n. You will need to use 2D Arrays for this project. For example if you give the size as 3, the 2D array should be:
  //The r represents rows and c columns. Numbers can not repeat.
  r r r
  c  2 7 6
  c  9 5 1 
  c  4 3 8
   
  s[2][1] = 3

  or a smiliar square that adds up to 15. Assume:
  size > 0;

  Make sure you have a function in case the user does not give you a size. You will need helper functions. You are free to use the format below or crearte your own:
*/

import java.io.*;
public class MagicSq{
    private int[][] sq;
    private int size;
       
    
    //Default Sq Init
    public void MagicSquare(){
	sq = new int[3][3];
	size = 3;
	
    }

    //Sq Init with a parameter
    public void MagicSquare(int n){
	sq = new int[n][n];
	size = n;
	
    }
    
    //Magic Square function
    public void MakeMagic(){
	if(size%4 == 0){
	    //Doubly Even sq goes here
	    fillSq();
	    int lim1 = size/4;
	    int lim2 = size/2;
	    int counter = 0;
	    for(int i = 0; i < lim2;i++){
		for(int j = 0; j < size; j++){
		    if(counter < lim1){
			if(j >= lim1 && j <= size-1-lim1)
			    sqReverse(i,j);
		    }
		    else{
			if(j < lim1 || j > size-1-lim1)
			    sqReverse(i,j);
		    }
		}
		counter++;
	    }
	    
	}
	else if(size%2 == 0){
	    //SinglyEven sq goes here
	    singlyStart();
	    int lim = size / 4;
	    int pos = 0;
	    int back = size - 1;
	    while( pos < lim){
		if(pos == 0){
		    swapSt();
		}
		else{
		    swapR(pos);
		}
		if(pos > 0){
		    swapR(back);
		}
		pos++;
	    }
	    int tmp = sq[pos][pos];
	    sq[pos][pos] = sq[size - pos - 1][pos];
	    sq[size - pos - 1][pos] = tmp;
	}
	else{
	    //Odd sq goes here
	    int rpos = size/2;
	    int cpos = 0;
	    int oldc = cpos;
	    int oldr = rpos;
	    int i = 1;
	    while(i <= size*size){
		if(sq[cpos][rpos] == 0){
		    oldc = cpos;
		    oldr = rpos;
		    sq[cpos][rpos] = i;
		    cpos = cOddCheck(cpos);
		    rpos = rOddCheck(rpos);
		}
		else{
		    cpos = oldc;
		    rpos = oldr;
		    cpos++;
		    sq[cpos][rpos] = i;
		    cpos = cOddCheck(cpos);
		    rpos = rOddCheck(rpos);
		}
		i++;
	    }
	}
    }
    
    //Helper Functions==================================================
    
    //Checks the coulmns in the Odd Square
    public int cOddCheck(int cpos){
	if(cpos == 0)
	    cpos = size - 1;
	else
	    cpos--;
	return cpos;
    }

    //Checks the rows in the Odd Square
    public int rOddCheck(int rpos){
	if(rpos == size - 1)
	    rpos = 0;
	else
	    rpos++;
	return rpos;
    }

    //Doubly Even Fills the Sq
    public void fillSq(){
	int n = 1;
	for(int i = 0; i < size;i++){
	    for(int j = 0; j < size; j++){
		sq[i][j] = n;
		n++;
	    }
	}
    }
    
    //Doubly Even Reverses Sq
    public void sqReverse(int col, int row){
	int tmp = sq[col][row];
	sq[col][row] = sq[size-1-col][size-1-row];
	sq[size-1-col][size-1-row] = tmp;
    }
    
    //Singly Even Square starts the filling of the square.
    public void singlyStart(){
	//Starting pos of the A sqaure 
	int A = 0;
	//Starting pos of the B square
	int B = size / 2;
	//Starting pos of the C square
	int Cc = 0;
	int Cr = size / 2;
	//Starting pos of the D square
	int Dc = size / 2;
	int Dr = 0;
	//Starting value of square
	int start = 1;
	start = singlyOdd(A,A,start);
	start = singlyOdd(B,B,start);
	start = singlyOdd(Cr,Cc,start);
	start = singlyOdd(Dr,Dc,start);
    }

    //Singly Even Odd Square
    public int singlyOdd(int startr, int startc, int start){
	int lim = (size/2) * (size/2);
	int rpos = startr + size/4;
	int cpos = startc;
	int oldc = cpos;
	int oldr = rpos;
	int rLim = startr + size/2 - 1;
	int cLim = startc + size/2 - 1;
	int i = 1;
	while(i <= lim){
	    if(sq[cpos][rpos] == 0){
		oldc = cpos;
		oldr = rpos;
		sq[cpos][rpos] = start;
		cpos = cOddCheck(cpos, startc, cLim);
		rpos = rOddCheck(rpos, rLim, startr);
	    }
	    else{
		cpos = oldc;
		rpos = oldr;
		cpos++;
		sq[cpos][rpos] = start;
		cpos = cOddCheck(cpos, startc,cLim);
		rpos = rOddCheck(rpos, rLim, startr);
	    }
	    start++;
	    i++;
	}
	return start;
    }

    //Checks the coulmns in the Odd Square
    public int cOddCheck(int cpos, int lim, int cLim){
	if(cpos == lim)
	    cpos = cLim;
	else
	    cpos--;
	return cpos;
    }

    //Checks the rows in the Odd Square
    public int rOddCheck(int rpos, int lim, int startr){
	if(rpos == lim)
	    rpos = startr;
	else
	    rpos++;
	return rpos;
    }

    //Swaps the 0 pos
    public void swapSt(){
	int i = 0;
	int lim = size/2;
	while( i < lim){
	    if(i != size/4){
	    int tmp = sq[i][0];
	    sq[i][0] = sq[lim+i][0];
	    sq[lim+i][0] = tmp;
	    }
	    i++;
	}
    }

    //Swaps the entire row
    public void swapR(int r){
	int i = 0;
	int lim = size/2;
	while( i < lim){
	    int tmp = sq[i][r];
	    sq[i][r] = sq[lim+i][r];
	    sq[lim+i][r] = tmp;
	    i++;
	}
    }
    
    //End Helpers ======================================================

    //This function prints the Array
    public void printArr(){
	for(int i = 0; i < size;i++){
	    for(int j = 0; j < size; j++){
		System.out.print(sq[i][j] + " ");
	    }
	    System.out.println("");
	}
    }
  
    
    //Returns the size of the magic Square
    public int size(){
	return size;
    }
    
    public static void main(String[] args){
	MagicSq sq = new MagicSq();
	sq.MagicSquare(10);
	System.out.println("This is the empty sq of size " + sq.size() + "...");
	sq.printArr();
	System.out.println("Watch the Magic happen...");
	sq.MakeMagic();
	sq.printArr();
    }      
    

}
