package JavaComparableAndComparator;

import java.util.Arrays;
import java.util.List;

public class JavaCustomComparator {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("pen", "blue", "atom", "to",
                "ecclesiastical", "abbey", "car", "ten", "desk", "slim",
                "journey", "forest", "landscape", "achievement", "Antarctica");

		words.sort((e1, e2) -> e1.length() - e2.length());
		words.forEach(System.out::println);
		
		System.out.println("------------------------------");
		
		words.sort((e1, e2) -> e2.length() - e1.length());
		words.forEach(System.out::println);
		
	}

}
