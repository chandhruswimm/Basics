package Shorting;

public class Sortingdemo {
	public static void main(String[] args) {
		Sortingdemo sd=new Sortingdemo();
		//sd.learning_1();//highest second highest
		//sd.learning_2();//highest second highest easy way
		//sd.learning_3();//bubble short descending> & ascending<
		//sd.learning_4();//removal of duplicates from an ordered array
		//sd.learning_5();//sub array or not
		//sd.learning_6();//binary search,given number is present or not in an array
		sd.learning_6();//
}
	private void learning_6() {
		// TODO Auto-generated method stub
		int []ar={10,17,25,38,69};
		int key=38;
		int min=0,max=ar.length-1;
		while(min<=max) {
			int mid=(min+max)/2;
			if(key==ar[mid]) {
				System.out.println("Key is present "+mid+" position");
				break;
			}
			else if(ar[mid]>key) {
				min=mid+1;
			}
			else if(key<ar[mid]) {
				max=mid-1;
			}
		}
		if(min>max) {
			System.out.println("Key is not present");
		}
	}
	private void learning_5() {
		// TODO Auto-generated method stub
		int [] a = {20,30,10};
		  int[] b = {10,20};
		  int count = 0;
		  for(int j=0; j<b.length; j++) {
		   boolean present = false;
		   for(int i=0; i<a.length; i++)
		   {
		    if(b[j]==a[i]) {
		     count++;
		     present = true;
		    }
		    }
		   if(present == false) {
		    System.out.println("Not sub Array");
		    break;
		   }
		   if(count == b.length) {
		    System.out.println("Sub Array"); 
		   }
		  }
	}
	private void learning_4() {
		// TODO Auto-generated method stub
		int[]ar= {20,20,30,40,50,50,50,60,60,70};
		int unique=1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]!=ar[i+1]) {
				ar[unique]=ar[i+1];
				unique++;
				//System.out.print(ar[unique]+" ");
			}
		}
		for(int i=0;i<unique;i++) {
			System.out.print(ar[i]+" ");
	}
	}
	private void learning_3() {
		// TODO Auto-generated method stub
		int [] ar= {90,80,70,75,83,92,67,35,98,96};
		for(int j=1;j<ar.length;j++) {
		for(int i=0;i<ar.length-j;i++) {
			if(ar[i]<ar[i+1]) {
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
			}
		}
		System.out.println(ar[ar.length-j]);
	}
	}

	private void learning_2() {
		// TODO Auto-generated method stub
		int [] ar= {100,90,80,70};
		for(int j=1;j<4;j++) {
		for(int i=0;i<ar.length-j;i++) {
			if(ar[i]>ar[i+1]) {
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
			}
		}
		System.out.println(ar[ar.length-j]);
	}
	}
	
	private void learning_1() {
		// TODO Auto-generated method stub
		int [] ar= {100,90,80,70};
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>ar[i+1]) {
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
			}
		}
		System.out.println(ar[ar.length-1]);
		for(int i=0;i<ar.length-2;i++) {
			if(ar[i]>ar[i+1]) {
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
			}
		}
		System.out.println(ar[ar.length-2]);
	}
}