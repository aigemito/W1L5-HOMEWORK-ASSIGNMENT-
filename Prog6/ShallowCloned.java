package Prog6;

class Person implements Cloneable {
	String name;

	Computer computer;

	public Person(String name, Computer computer) {
		super();

		this.name = name;
		this.computer = computer;
	}

	protected Object clone() throws CloneNotSupportedException {
		Person clone = (Person) super.clone();

		return clone;

	}

	@Override

	public String toString() {

		return "Person [Name=" + name + ", Computer=" + computer + "]";

	}

}

public class ShallowCloned {

	public static void main(String[] args) throws CloneNotSupportedException {
		Computer com1 = new Computer("acer", "Intel Core I5", 8, 3.5);
		Person p1 = new Person("Gloria", com1);

		System.out.println(p1);

		System.out.println();
		System.out.println("CLONE() P1");
		Person p3 = (Person) p1.clone();
		System.out.println("Copy : " + p3);

		System.out.println("CHANGE MANUFACTURER IN P1");
		p1.computer.setManfacturer("Apple");
		System.out.println();

		System.out.println("Original : " + p1);

		System.out.println("Copy : " + p3);

	}

}
