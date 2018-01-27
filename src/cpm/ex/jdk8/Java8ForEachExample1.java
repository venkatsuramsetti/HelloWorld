package cpm.ex.jdk8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample1 {

	public static void main(String[] args) {
		// creating sample Collection
		List<Employee> empList = new ArrayList<Employee>();
		for (int i = 0; i < 3; i++) {
			Employee emp = new Employee();
			emp.setEmpNo(i);
			emp.setEmpName(i+ " Name");
			empList.add(emp);
		}

		// traversing using Iterator
		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println("Iterator Value::" + emp.getEmpNo());
		}

		// traversing through forEach method of Iterable with anonymous class
		empList.forEach(new Consumer<Employee>() {

			public void accept(Employee t) {
				System.out.println("forEach anonymous class Value::" + t.getEmpNo());
			}

		});

		// traversing with Consumer interface implementation
		MyConsumerOne action = new MyConsumerOne();
		empList.forEach(action);

	}

}

// Consumer implementation that can be reused
class MyConsumerOne implements Consumer<Employee> {

	public void accept(Employee t) {
		System.out.println("Consumer impl Value::" + t.getEmpNo());
	}

}
