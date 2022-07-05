package FP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Experiment12 {
	  class ERemover implements Function<String, String> {
		    public String apply(String value) {
		      return value.replaceAll("s", "");
		    }
		  }
		  
		  public void run() {
		    String[] n1 = {"L. Messi","Cristiano Ronaldo","Neymar Jr","De Gea"};

		    List<String> n2 = Arrays.asList(n1);

		    n2.stream().map(new ERemover()).forEach(value -> System.out.println(value));

		  }

		  public static void main(String[] args) {
		    new Experiment12().run();
		  }
}
