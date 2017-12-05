package witeBoxTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeDetails {	
	private String name;
	private int age;
	private double monthlySalary;	
	//set name
	public void setName(String name){
		this.name=name;		
	}
	//get name
	public String getName(){
		return name;		
	}
	//set age
	public void setAge(int age){
		this.age=age;		
	}
	//get age
	public int getAge(){
		return age;		
	}
	//set monthly salary
	public void setMonthlySalary(double monthlySalary){
		this.monthlySalary=monthlySalary;		
	}
	//get monthly salary
	public double getMonthlySalary(){
		return monthlySalary;				
	}
}

public class EmployeeBusiness {

	public double yearlySalary(EmployeeDetails employeeDetails){
		double yearlySalary=0.0;
		yearlySalary=employeeDetails.getMonthlySalary()*12;
		return yearlySalary;		
	}

	public double appraisals(EmployeeDetails employeeDetails){
		double appraisals = 0.0;
		if(employeeDetails.getMonthlySalary() < 10000){
			appraisals=500.0;
		}
		else {
			appraisals=1000.0;
		}
		return appraisals;		
	}
}
@Test
public class Test1 {
	EmployeeDetails employee=new EmployeeDetails();
	EmployeeBusiness business=new EmployeeBusiness();

	public void testYearlySalary(){
		employee.setName("Shivaraj");
		employee.setAge(19);
		employee.setMonthlySalary(20000);
		double yearlySalary = business.yearlySalary(employee);

		Assert.assertEquals(yearlySalary, 240000.0);		
	}

	public void testAppraisalLessThanTenThousand(){
		employee.setName("Shiva");
		employee.setAge(22);
		employee.setMonthlySalary(9000);
		double appraisals = business.appraisals(employee);

		Assert.assertEquals(appraisals, 500.0);
	}

	public void testAppraisalMoreThanTenThousand(){
		employee.setName("Himaja");
		employee.setAge(18);
		employee.setMonthlySalary(16000);
		double appraisals = business.appraisals(employee);

		Assert.assertEquals(appraisals, 1000.0);
	}



}