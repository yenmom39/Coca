package fistProgram;

public class DemoEmpoyeeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "Mom";
		char gender = 'F';
		int age = 20;
		double wage = 2.5;
		int hour =8;
		double  totalSalary = wage *hour;
		
		
		System.out.println("Name >>>" + strName);
		System.out.println("Gender >>>" + gender);
		System.out.println("Age >>>" + age);
		System.out.println("Wage >>> $" + wage);
		System.out.println("hour >>>" + hour);
		System.out.println("TotalSalary >>> $" + totalSalary);
		
		System.out.print("================================\n\n");
		
		System.out.print("Name >>>" + strName +
						 "\nGender >>>" + gender +
						 "\nAge >>>" +age +
						 "\nWage >>>$" +wage +
						 "\nHour >>>" + hour + 
						 "\nTotalSalary >>>$" + totalSalary);
		
		

	}

}
