package exam;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(new Employee("Jack", 25000));
		employee.add(new Employee("Mary", 28000));
		employee.add(new Manager("Eddie", 40000));
		employee.add(new Director("Teddy", 50000, 3000));
		employee.add(new Employee("Danny", 31000));
		employee.add(new Manager("Andy", 47000));
		employee.add(new Director("Frank", 70000, 9000));
		for (int i = 0; i < employee.size(); i++) {
			employee.get(i).print();
		}
	}

}
