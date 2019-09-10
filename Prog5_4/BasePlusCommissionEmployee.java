package Prog5_4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	double baseSalary;
	public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate,double baseSalary) {
		super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
		this.baseSalary=baseSalary;
		
	}
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return baseSalary + super.getPayment();
	}
}
