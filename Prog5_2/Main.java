package Prog5_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DeptEmployee[] dept=new DeptEmployee[5];
		dept[0]=new Professor("Renuka",3000,2019,5,2,4);
		dept[1]=new Professor("kieth",5000,2015,5,2,8);
		dept[2]=new Professor("Gathri",2000,1992,5,2,2);
		
		dept[3]=new Secretary("Eden",3000,2019,5,2,1);
		dept[4]=new Secretary("Meriam",5000,2015,5,2,1);
		
		Scanner s=new Scanner(System.in);
	    System.out.println("Do you want all the salaries.(y/n)");
	    String input=s.next();
	    if(input.equalsIgnoreCase("Y")) {
	    	double sum=0;
	    	for (DeptEmployee deptEmployee : dept) {
	    		sum+=deptEmployee.computeSalary();
			}
	    	System.out.println(sum);
	    }
	}
}
