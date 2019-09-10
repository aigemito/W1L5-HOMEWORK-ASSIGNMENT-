package Prog5_4;

public class Test {
	public static void main(String[] args) {
		Employee[] emp= {new CommissionEmployee("amanuel","isack","123-452-104",1000,0.05),
						new CommissionEmployee("Bruk","grimay","123-452-104",5000,0.02),
						new HourlyEmployee("Robi","Balbale","123-452-104",4000,4),
						new SalariedEmployee("Selam","Esset","123-452-104",600),
						new BasePlusCommissionEmployee("amanuel","isack","123-452-104",1000,0.03,2000)
						};
		double sum=0.0;
		for (Employee employee : emp) {
			sum +=employee.getPayment();
			
		}
		System.out.println("The total salary is "+sum);
		System.out.println();
	}
}
