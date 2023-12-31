package day6_ex.emp;

public class Secretary extends Employee implements Bonus {
	public Secretary() {
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		setSalary((int) (getSalary() + (pay * 0.8)));
	}

	public double tax() {
		return getSalary() * 0.1;
	}

}
