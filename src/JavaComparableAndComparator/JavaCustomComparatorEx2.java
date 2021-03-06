package JavaComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

class Car {

    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

class CompareByPrice implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		// TODO Auto-generated method stub
		return c1.getPrice() - c2.getPrice();
	}
	
}

class CompareByName implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		// TODO Auto-generated method stub
		return c1.getName().compareTo(c2.getName());
	}
	
}


public class JavaCustomComparatorEx2 {

	public static void main(String[] args) {

		Car[] cars = {
                new Car("Volvo", 23400), new Car("Mazda", 13700),
                new Car("Porsche", 353800), new Car("Skoda", 8900), 
                new Car("Akoda", 9900),
                new Car("Volkswagen", 19900)
        };

		System.out.println("comparison by price : ");		
		Arrays.sort(cars, new CompareByPrice());
		
		for(Car car : cars) {
			System.out.println(car);
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("comparison by name : ");
		Arrays.sort(cars, new CompareByName());
		for(Car car : cars) {
			System.out.println(car);
		}
	}

}
