package logic_pro;
public class PatternLetters {

	public static void main(String[] args) {
PatternLetters pl=new PatternLetters();
//pl.patternC();
//pl.patternH();
pl.patternA();
	}

	private void patternA() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) 
			    {
			     if(row+col==7&&col>=2&&col<=4||col-row==1&&col>=4&&col<=6||row==4&&col>=3&&col<=5) {
			    	 
			    System.out.print("* ");
			    }
			    else
			     System.out.print("  ");
	}
		System.out.println();
		}
	}

	private void patternH() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			   for (int col=1;col<=7;col++) 
			    {
			     if(col==1|| col==7||row==4) {
			   
			    System.out.print("* ");
			    }
			    else
			     System.out.print("  ");
	}
		System.out.println();
		}
	}
	
	private void patternC() {
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
		
	}
