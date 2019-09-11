package Prog5_2;

public class Professor extends DeptEmployee{
	int numberOfPublication;
	public Professor(String name,double salary,int year,int month,int day,int numberOfPublication) {
		super(name,salary,year,month,day);
		this.numberOfPublication=numberOfPublication;
	}
	public int getNumberOfPublication() {
		return numberOfPublication;
	}
	public void setNumberOfPublication(int numberOfPublication) {
		this.numberOfPublication = numberOfPublication;
	}
	
}
