package Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="java";
	char c[]=new char[s.length()];
	char search='a';
	for (int i = 0; i < s.length(); i++) {
		c[i]=s.charAt(i);
		if(c[i]==search) {
			System.out.println("Index is"+i);
			break;
		}
	}
	System.out.println();
	int a[]= {7,1,11,9,0,2,6,4,3,5,1,9,7};
	System.out.println("first element is"+a[0]);
	System.out.println("last element is"+a[a.length-1]);
	if(a.length%2==0) {
		System.out.println("mid element is"+a[a.length/2]);
		System.out.println("mid element is"+a[a.length/2-1]);
	}
	else {
		System.out.println("mid element is"+a[a.length/2]);
	}
	System.out.println();
	//find sum,count,avg of element in array
	int x[]= {7,3,1,9,4,6,3,7,2,8};
	int sum=0;
	int count=0;
	for (int i = 0; i < x.length; i++) {
		sum=sum+i;
		count++;
	}
		System.out.println("sum is"+sum);
		System.out.println("count is"+count);
		System.out.println("Avarage is"+count/x.length);
		//print odd element present in even index
		int y[]= {7,3,1,9,4,6,5,3,7,2,8};
		for (int i = 0; i < y.length; i++) {
			if(i%2==0&&y[i]%2!=0) {
				System.out.println(y[i]);
			}
		}
		System.out.println();
		//print even element present in odd index
		int z[]= {7,3,1,9,4,6,5,3,7,2,8};
		for (int i = 0; i < y.length; i++) {
			if(i%2!=0&&z[i]%2==0) {
				System.out.println(z[i]);
			}
		}
		}

}
