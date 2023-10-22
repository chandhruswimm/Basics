package LoopingPrograms;

public class Array_fourthmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 96, 75, 70, 94, 100 };
		int m = 0, sm = 0, tm = 0, fm = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > m) {
				sm = m;
				m = a[i];
			} else if (a[i] > sm) {
				tm = sm;
				sm = a[i];
			} else if (a[i] > tm) {
				fm = tm;
				tm = a[i];
			} else if (a[i] > fm) {
				fm = a[i];
			}
		}
		System.out.println("fourth max is:" + fm);

	}

}
