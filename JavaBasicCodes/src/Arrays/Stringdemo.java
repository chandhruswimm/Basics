package Arrays;

public class Stringdemo {
	public static void main(String[] args) {
//		String s="mississippi is a river";
//		char c[]=new char[s.length()];
//		char search='i',replace='!';
//		for(int i=0;i<c.length;i++) {
//			c[i]=s.charAt(i);
//			if(c[i]==search) {
//				c[i]=replace;
//				break;
//			}
//			
//		}
//		System.out.println(c);
//	}
		String s = "mississippi is a river";
		char c[] = new char[s.length()];
		char search = 'i', replace = '!';
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}

		for (int i = c.length - 1; i >= 0; i--) {
			if (c[i] == search) {
				c[i] = replace;
				break;
			}
		}

		System.out.println(c);
	}
}