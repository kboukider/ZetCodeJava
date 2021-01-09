package JavaComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    };

    public int getAge() {

        return this.age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}


public class JavaBuiltInComparatorEx2 {
	
public static void main(String[] args) {
	
	Person p1 = new Person("Robert", 23);
	Person p2 = new Person("Monika", 18);
    Person p3 = new Person("Tom", 37);
    Person p4 = new Person("Elisabeth", 31);
    
    List<Person> vals = Arrays.asList(p1, p2, p3, p4);
    
    vals.sort(Comparator.comparingInt(Person::getAge));
    vals.forEach(System.out::println);
    
}

}
