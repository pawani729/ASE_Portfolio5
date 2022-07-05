package FP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Experiment10 {
	
	class EFilter implements Predicate<String>{
		public boolean test(String value) {
			return value.contains("s");
		}
	}
	
	public void run() {
	  String[] n1 = {"L. Messi","Cristiano Ronaldo","Neymar Jr","De Gea"};
		
		List<String> n2 = Arrays.asList(n1);
		
		n2.stream().filter(new EFilter()).forEach(value -> System.out.println(value));
	}
	
	public static void main (String[] args) {
		new Experiment10().run();
	}

}
