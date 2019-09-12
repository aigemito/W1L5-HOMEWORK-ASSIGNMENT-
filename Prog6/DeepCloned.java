package Prog6;

class Person1 implements Cloneable {
	String name;

	Computer computer;

	public Person1(String name, Computer computer) {

		this.name = name;
		this.computer = computer;
	}

	protected Object clone() throws CloneNotSupportedException {
		Person1 clone = (Person1) super.clone();
		clone.computer = (Computer)this.computer.clone();
		return clone;

	}

	@Override

	public String toString() {

		return "Person [Name=" + name + ", Computer=" + computer + "]";

	}

}

public class DeepCloned {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Computer com1 = new Computer("acer", "Intel Core I5", 8, 1.57);
		Person1 p1 = new Person1("Gloria", com1);

		System.out.println(p1);

		System.out.println();
		System.out.println("CLONE() P1");
		Person1 p3 = (Person1) p1.clone();
		System.out.println("Copy : " + p3);

		System.out.println("CHANGE MANUFACTURER IN P1");
		p1.computer.setManfacturer("Apple");

		System.out.println();

		System.out.println("Original : " + p1);

		System.out.println("Copy : " + p3);

	}

}