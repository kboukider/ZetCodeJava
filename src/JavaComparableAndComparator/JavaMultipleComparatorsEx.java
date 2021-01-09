package JavaComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person2 {

    private String name;
    private int age;
    private String city;

    public Person2(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", city='").append(city).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


public class JavaMultipleComparatorsEx {

	public static void main(String[] args) {
		
		List<Person2> persons = Arrays.asList(
				new Person2("Peter", 23, "New York"),
                new Person2("Sarah", 13, "Las Vegas"),
                new Person2("Aucy", 33, "Toronto"),
                new Person2("Sarah", 21, "New York"),
                new Person2("Tom", 18, "Toronto"),
                new Person2("Robert", 23, "San Diego"),
                new Person2("Lucy", 23, "Los Angeles"),
                new Person2("Sam", 36, "Dallas"),
                new Person2("Elisabeth", 31, "New York"),
                new Person2("Ruth", 29, "New York"),
                new Person2("Sarah", 41, "New York")
				);
		
		persons.sort(Comparator.comparing(Person2::getName)
				.thenComparing(Person2::getCity)
				.thenComparing(Person2::getAge));
		persons.forEach(System.out::println);
	}

}
