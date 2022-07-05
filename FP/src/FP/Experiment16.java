package FP;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Supplier;

public class Experiment16 {
	  public static void main(String[] args) {
		    Supplier<String> dateSupplier = new Supplier<String>() {
		      public String get() {
		        LocalDate date = LocalDate.now(); 
		        return date.toString();
		      }
		    };  
        Supplier<String> timeSupplier = new Supplier<String>() {
          public String get() {
            LocalTime time = LocalTime.now();
            return time.toString();
          }
        };
        System.out.printf("Today is %s", dateSupplier.get());
        System.out.printf("   Time is %s", timeSupplier.get());
		  }
}
