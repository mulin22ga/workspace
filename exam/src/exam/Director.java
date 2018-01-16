package exam;

public class Director extends Manager {
	int plus;

	public Director(String name, int money, int plus) {
		super(name, money);
		this.plus = plus;
	}

	@Override
	public void print() {
		System.out.println(name + "\t" + momey + "\t" + plus);
	}
}
