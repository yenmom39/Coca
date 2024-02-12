package fistProgram;


import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable
		String name;
		String gender;
		int age, hour;
		double wage, total;
		
		//2 Create object Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//3 Call method in scanner
		System.out.println("Name :");
		name = sc.next();
	
		System.out.println(" Gender : " );	
		gender = sc.next();
		
		System.out.println(" Age : " );	
		age = sc.nextInt();
		
		System.out.println(" Wage : " );	
		wage = sc.nextDouble();
		
		System.out.println(" Hour : " );	
		hour = sc.nextInt();
		
		total = wage * hour;
		
		//4 close scanner 
		sc.close();
		
		//output 
		System.out.print("\nName :" + name + 
						 "\nGender : " + gender +  
						 "\nAge : " + age + 
						 "\nWage : $" + wage +
						 "\nHour : " + hour +
						 "\nTotal : $" + total);
		
		

	}

}
