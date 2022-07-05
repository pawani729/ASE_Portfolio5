package FP;

import java.util.function.Supplier;

public class Experiment13 {
	  class NameSupplier implements Supplier<String>{
	    String[] n1 = {"L. Messi","Cristiano Ronaldo","Neymar Jr","De Gea"};
      int nextIndex = 0;
      public String get() {
        if(nextIndex< n1.length) {
          return n1[nextIndex++];
        }
        return null;
      }    
		  }
		  
		  public void run() {
		    NameSupplier vs = new NameSupplier();

		    System.out.println(vs.get());
		    System.out.println(vs.get());
		    System.out.println(vs.get());
		    System.out.println(vs.get());
		  }

		  public static void main(String[] args) {
		    new Experiment13().run();
		  }
}
