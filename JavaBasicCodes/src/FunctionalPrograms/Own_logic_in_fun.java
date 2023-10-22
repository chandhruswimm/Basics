package FunctionalPrograms;
import java.util.stream.Stream;

public class Own_logic_in_fun {

	public static void main(String[] args) {
		Stream.iterate(1,i->++i).
		limit(10).forEach(n->System.out.print(n+" "));//1 to 10 print
		System.out.println();
		
Stream.iterate(1,i->++i).
		limit(10).filter(i->i%2==0).
		forEach(n->System.out.print(n+" "));//even number printing
System.out.println();

Stream.iterate(2, i->i+2).
limit(10).forEach(n->System.out.print(n+" "));
	}

}
