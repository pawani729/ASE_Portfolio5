package FP;

import java.util.Arrays;
import java.util.List;

public class Experiment09 {
	public void run() {
	  String[] n1 = {"L. Messi","Cristiano Ronaldo","Neymar Jr","De Gea"};
		
		List<String> n2 = Arrays.asList(n1);
		
		/*
		 * use a Lambda to implement a predicate that filters
		 * out names that do not include an 'e' character
		 */
		
		n2.stream().filter(value -> value.contains("s"))
		.forEach(value -> System.out.println(value));
	}
	
	public static void main(String[] args) {
		new Experiment09().run();
	}

}
