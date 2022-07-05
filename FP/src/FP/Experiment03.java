package FP;

import java.util.Arrays;
import java.util.List;

public class Experiment03 {
	public static void main(String[] args) {
	  String[] n1 = {"L. Messi","Cristiano Ronaldo","Neymar Jr","De Gea"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println(n2.getClass());
		for(String value:n2) {
			System.out.println(value);
		}
		
		
		
	}

}

/*In this code the array is converted to a List so that advantages
 * of the Collection API may used later
 */
