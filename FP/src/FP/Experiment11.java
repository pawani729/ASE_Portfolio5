package FP;

import java.util.Arrays;
import java.util.List;

public class Experiment11 {
	public void run() {
	  String[] n1 = {"L. Messi","Cristiano Ronaldo","Neymar Jr","De Gea"};
		
		List<String> n2 = Arrays.asList(n1);
		n2.stream().map(name -> name.replaceAll("s", "")).forEach(name -> System.out.println(name));
		
	}
	public static void main(String[] args) {
		new Experiment11().run();
	}

}
