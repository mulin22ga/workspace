package exam;

public class Manager extends Employee {
	public Manager(String name, int money) {
		super(name, money);
	}

	@Override
	public void print() {
		System.out.println(name + "\t" + momey );
	}
}
