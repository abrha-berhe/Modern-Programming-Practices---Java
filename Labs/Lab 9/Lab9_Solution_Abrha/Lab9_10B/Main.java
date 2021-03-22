package Lab9_10B;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		 //============ Answer for Problem 10 B =============
		Stream<String> stringStream = Stream.of("Bill","Thomas","Mary");  
		// Write the one line of code necessary to print the stream "stringStream" to the console so that the output looks like: Bill, Thomas, Mary 
		 System.out.println(stringStream.collect(Collectors.joining(",")));
		 
		 
		 //============ Answer for Problem 10 C =============
		 
		 //You have a Stream of Integers called myIntStream and 
		 //you need to output both the maximum and minimum values somehow, making use of this stream only once. 
		 // Write compact code that efficiently accomplishes this.
		 
		 IntStream myIntStream = IntStream.of(1,3,2,4,5,1,6,8,0,88);		 
		 IntSummaryStatistics myIntStatistic = myIntStream.summaryStatistics();
		 System.out.println("Min: " +myIntStatistic.getMin() + "\nMax: " +myIntStatistic.getMax()  );
			 		                         
		 
		    
		 ;

	}

}
