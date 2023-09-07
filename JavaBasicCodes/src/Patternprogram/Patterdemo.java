package Patternprogram;

public class Patterdemo {

	 public static void main(String[] args) {
		 Patterdemo pd = new  Patterdemo();
	  //pd.pattern1();
	  //pd.patten2();
	  pd.pattern3();
	  //pd.pattern4();
	  //pd.pattern5();
	  //pd.pattern6();
	//pd.pattern7();
	//pd.pattern8();
	//pd.pattern9();
	//pd.pattern10();
	//pd.pattern11();
	//pd.pattern12();
	//pd.pattern13();
	//pd.pattern14();
	//pd.pattern15();
	//pd.pattern16();
	//pd.pattern17();
	//pd.pattern18();

	 } 
	 private void pattern18() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
		 for (int col=1;col<=7;col++) {
		  if(row==4&&row<=4||col==4||row==1&&col>4||col==7&&row>4||row==7&&col<4||col==1&&row<4)
		  {
		  System.out.print("* ");
		  }
		  else
		   System.out.print("  "); 
		}
		 System.out.println();
		}
		}

		private void pattern17() {
		for(int row=1;row<=7;row++)
		{
		 for(int col=1;col<=7;col++)
		 {
		  if(row>=4&&col==1||row==1||row==7||row<=4&&col==7||row==4)
		   System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		}
		}

		private void pattern16() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
		 for(int col=1;col<=7;col++)
		 {
		  if(row==1||row==7||col==7||row==4)
		   System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		}
		}

		private void pattern15() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
		 for(int col=1;col<=7;col++)
		 {
		  if(row<=4&&col==1||row==1||row==7||row>=4&&col==7||row==4)
		   System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		}

		}

		private void pattern14() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
		 for(int col=1;col<=7;col++)
		 {
		  if(col==1||row==1||row==7||col==7||row==4)
		   System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		}
		}

		private void pattern13() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
		 for(int col=1;col<=7;col++)
		 {
		  if(col==1||row==1||row==7||col==7)
		   System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		}
		}

		private void pattern12() {
		for(int row=1;row<=7;row++) {
		 for (int col=1;col<=7;col++) {
		  if(col==row&&col<4||col==1||col==7 ||col>=4&&col+row==8)
		  System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		 
		}

		}

		private void pattern11() {
		for(int row=1;row<=7;row++) {
		 for (int col=1;col<=7;col++) {
		  if(col==row||col==1||col==7 ||col+row==8)
		  System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		 
		}

		}

		private void pattern10() {
		for(int row=1;row<=7;row++) {
		 for (int col=1;col<=7;col++) {
		  if(col==row && col<=4||col+row==8 && col>=4||row>4 && col==4) {
		  System.out.print("* ");
		  }
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		}
		}

		private void pattern9() {
		for(int row=1;row<=7;row++) {
		 for (int col=1;col<=7;col++) {
		  if(col==row && col<=4 ||col+row==8)
		  System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		 
		}

		}

		private void pattern8() {
		for(int row=1;row<=7;row++) {
		 for (int col=1;col<=7;col++) {
		  if(col==row ||col+row==8)
		  System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		 
		}

		}

		private void pattern7() {
		for(int row=1;row<=7;row++) {
		 for (int col=1;col<=7;col++) {
		  if(col==1 || col==row || col==7||col==row)
		  System.out.print("* ");
		  else
		   System.out.print("  ");
		 }
		 System.out.println();
		 
		}


		}
	 private void pattern6() {
			// TODO Auto-generated method stub
			 for(int row=1;row<=7;row++) {
				   for (int col=1;col<=7;col++) {
					    if(col==1 || col==row) 
					    	System.out.print("* ");	   
				   else 
					   System.out.print("  ");
				   }
					  	
				   System.out.println();
		}
			 }
	 private void pattern5() {
		 for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) {
				    if(col==1) 
				    	System.out.print("* ");
				   }
				   System.out.println();
				   
				  }	
	}
	private void pattern4() {
	 for(int row=1;row<=7;row++) {
		   for (int col=1;col<=7;col++) {
			    if(row==1 || row==7  || col==1 ||col==7) {
			    	if(row==1&&col==7 || row==7&&col==7){
			    		System.out.print(" ");
			    	}
			    	else
			    System.out.print("* ");
			    }
			    else
			     System.out.print("  ");
			   }
			   System.out.println();
			   
			  }
	 }

	 private void pattern3() {
	  for(int row=1;row<=7;row++) {
	   for (int col=1;col<=7;col++) {
	    if(row==1 || col==1 ||row==7)
	    {
	     if(row==1&&col==1 || row==7 && col==1) {
	    	 System.out.print("  ");
	      
	     }
	    System.out.print("* ");
	    }
	    else
	     System.out.print("  ");
	   }
	   System.out.println();
	   
	  }
	  
	 }

	 private void patten2() {

	  for(int row=1;row<=7;row++) {
	  for (int col=1;col<=7;col++) {
	   if(row==1) {
	   System.out.print("* ");
	   }
	   else {
	    if(col!=4)
	    System.out.print("  " );
	    else
	     System.out.print("* ");
	   }
	  }
	  System.out.println();
	  
	 }
	  
	 }
	 

	 private void pattern1() {
	  
	  for(int row=1;row<=7;row++) {
	  for (int col=1;col<=7;col++) {
	   System.out.print("* ");
	  }
	  System.out.println();
	  
	 }

	 }
	}
