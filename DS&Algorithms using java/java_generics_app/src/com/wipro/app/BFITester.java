package com.wipro.app;
import java.util.function.Function;
import java.util.function.Predicate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Supplier;
/**
* Function<Integer,Long>
public abstract long factorial(int num);  returns factorial of given number
public abstract Long apply(Integer num);  returns factorial of given number
Consumer<String>
public abstract void greeting(String name): : prints “Good Day, <name>”
public abstract void accept(String name): : prints “Good Day, <name>”
Predicate<Integer>
public abstract boolean isEven(int num); returns if given number is even
                                                              number else returns false
public abstract Boolean test(Integer num);
Supplier<String>
public abstract String getDateTime() ; returns current date and time as a
String
public abstract String get()
*/
public class BFITester {
	public static void main(String[] args) {
		/* Implement factorial method that receives an integer value
		 * and returns long value using built-in functional interface
		 *
		 */
		
		Function<Integer,Long> fun1 = n->{
			long f=1;
			while(n>0) {
				f=f*n--;
			}
			return f;
		};
		System.out.println("Factorial of 5 is "+ fun1.apply(5));
		
System.out.println("------------------------");
		
		Consumer<String> con1 = s -> System.out.print("Good Day, "+s);
		con1.accept("Smith");
		
		System.out.println("\n------------------------");
		Predicate<Integer> pred1 = n -> (n%2==0)?true:false;
		System.out.println(pred1.test(5));
		
		System.out.println("-------------------------");
		
		Supplier<String> sup1 = () -> LocalDateTime.now().toString();
		System.out.println(sup1.get());

	}
}
