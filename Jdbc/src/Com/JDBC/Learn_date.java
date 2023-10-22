package Com.JDBC;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Learn_date {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		String s=dtf.format(LocalDateTime.now());
		System.out.println(s);
		Locale l=new Locale("how are you","in");
		System.out.println(l);
	}

}
