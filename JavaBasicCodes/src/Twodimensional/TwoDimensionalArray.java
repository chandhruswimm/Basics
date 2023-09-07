package Twodimensional;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimensionalArray tda=new TwoDimensionalArray();
		//tda.learning_1();//two dimensional basic
		//tda.learning_2();
		//tda.learning_3();//matrix of two arrays
		//tda.learning_4();//mark calculation
		tda.learning_6();//spiral matrix
	}
	private void learning_6() {

		  int[][] a = new int[4][4];
		  for(int i=0;i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(a[i][j]+"  ");
		    }
		    System.out.println();
		  }
		  
		  int no = 1; 
		  int minRow=0, minCol=0, maxCol=3, maxRow=3; 
		  while(no<=16)
		  {
		  
		  for(int col=minCol; col<=maxCol; col++)
		  {
		    a[minRow][col] = no; no++; 
		  }
		  minRow++;
		  // 5 6 7 
		  for(int row=minRow; row<=maxRow; row++)
		  {
		    a[row][maxCol] = no; no++; 
		  }
		  maxCol--; 
		  
		  //8 9 10
		  for(int col=maxCol; col>=minCol; col--)
		  {
		    a[maxRow][col] = no; no++; 
		  }
		  maxRow--; 
		  
		  // 11 12
		  for(int row=maxRow;row>=minRow; row--)
		  {
		    a[row][minCol] = no; no++; 
		  }
		  minCol++; 
		  }
		  
		  for(int i=0;i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(a[i][j]+"\t");
		    }
		    System.out.println("\n");
		  }
		
	}
	private void learning_5() {
		// TODO Auto-generated method stub
		int[][]a= {{10,20,30},{40,50,60},{70,80,90}};
		int total=0;
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(row==col) {
				total+=a[row][col];
			}
		}
		}
		System.out.println(total);
	}
	private void learning_4() {
		// TODO Auto-generated method stub
		int[][]mark= {{50,60,45,80,90},{60,78,35,76,87}};
		int total=0;
		for(int row=0;row<mark.length;row++) {
			for(int col=0;col<mark[row].length;col++) {
				total=total+mark[row][col];
			}
			System.out.println(total);
			total=0;
		}
	}
	private void learning_3() {
		// TODO Auto-generated method stub
		int[][]a= {{10,20},{30,40}};
		int[][]b= {{40,30},{20,10}};
		int[][]c=new int[2][2];
		for(int row=0;row<c.length;row++) {
			for(int col=0;col<c[row].length;col++) {
				c[row][col]=a[row][col]+b[row][col];
				System.out.println(c[row][col]);
			}
		}
	}
	private void learning_2() {
		Scanner sc=new Scanner(System.in);
		int [][] player = new int[2][];
		System.out.println(player.length);
		int total=0;
		player[0]=new int[4];
		for(int match=0;match<player[0].length;match++) {
			System.out.println("enter score: ");
			player[0][match]=sc.nextInt();
			total+=player[0][match];
		}
		System.out.println(total);
		System.out.println(total/player[0].length);
		total=0;
		player[1]=new int[3];
		for(int match=0;match<player[1].length;match++) {
			System.out.println("enter score: ");
			player[1][match]=sc.nextInt();
			total+=player[1][match];
		}
		System.out.println(total);
		System.out.println(total/player[1].length);
	}

	private void learning_1() {
		// TODO Auto-generated method stub
		int [][] scores = {{65,35,120,80},{35,68,110,90}};
		  int player = 0;
		  while(player<2) {
		  for(int match=0;match<4;match++) {
		   System.out.println(scores[player][match]);
		  }
		  System.out.println();
		  player++;
		  }
	}

}
