package JavaComparableAndComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JavaBuiltInComparatorEx {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("dog");
		words.add("pen");
        words.add("sky");
        words.add("ann");
        words.add("rock");
        words.add("den");
        words.add("fountain");
        
        words.sort(Comparator.naturalOrder());
        words.forEach(System.out::println);
        
        System.out.println("------------------");
        words.sort(Comparator.reverseOrder());
        words.forEach(System.out::println);

	}

}
