package FP;

import java.util.stream.Stream;

public class Experiment14 {
	  class NameStreamBuilder {
		    public Stream<String> build(){
		      Stream.Builder<String> builder = Stream.builder(); 
          builder.add("L. Messi");
          builder.add("Cristiano Ronaldo");
          builder.add("Neymar Jr");
          builder.add("De Gea");
		      return builder.build();
		    }
		  }
		  
		  public void run() {
		    NameStreamBuilder builder = new NameStreamBuilder();
		    Stream <String> nameStream = builder.build();
		    nameStream.forEach(n -> System.out.println(n));
		  }

		  public static void main(String[] args) {
		    new Experiment14().run();
		  }
}
