package FunctionalPrograms;
import java.util.ArrayList;
public class FuntionalDemo {

 public static void main(String[] args) {
  FuntionalDemo fd=new FuntionalDemo();
 //fd.demo1();
//fd.demo2();//sum,count
fd.demo3();
 }

 private void demo3() {
	 ArrayList <String>al=new ArrayList();
	  al.add("hello");
	  al.add("how are you");
	  al.add("did you have food in the morning");
	  al.add("what food are you had");
	  al.add("okay bye");
	al.forEach(i->System.out.println(i));
	System.out.println(al.stream().filter(n->n.contains("a")).count());
	al.forEach(i->System.out.println(i.toUpperCase()));
}

private void demo2() {
  ArrayList <Integer> al=new ArrayList();
  al.add(5);
  al.add(10);
  al.add(15);
  al.add(20);
  al.add(25);
 System.out.println(al.stream().filter(n->n%2==1).mapToInt(i->i).sum());
 System.out.println(al.stream().filter(n->n%2==1).count());
 }

 private void demo1() {
  ArrayList <Integer> al=new ArrayList();
  al.add(5);
  al.add(10);
  al.add(15);
  al.add(20);
  al.add(25);
  al.forEach(i->System.out.println(i));
 }
}
