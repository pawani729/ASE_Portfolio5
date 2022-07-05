package FP;

import java.util.Arrays;
import java.util.List;

public class Experiment08 {
	public void run() {
	  String[] n1 = {"L. Messi","Cristiano Ronaldo","Neymar Jr","De Gea"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println("Serial values\n--------");
		n2.stream().forEach(value -> System.out.println(value));
		
		System.out.println("\nParallel values\n--------");
		n2.parallelStream().forEach(value -> System.out.print(value));
	}
	
	public static void main(String[] args) {
		new Experiment08().run();
	}

}
