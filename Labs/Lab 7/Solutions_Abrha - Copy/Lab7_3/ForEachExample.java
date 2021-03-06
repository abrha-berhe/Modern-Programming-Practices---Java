package Lab7_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		Consumer<String> consumer = con;
		list.forEach(consumer);	
	}
	
	//Implement a Consumer
	static Consumer<String> con = s-> {
		s = s.toUpperCase();
		System.out.println(s); 
	};
	
}