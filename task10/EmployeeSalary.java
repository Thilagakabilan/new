package task10;

import java.util.Scanner;

public class EmployeeSalary {

	
	//Creating class Employee with the given data members

		
		static int id;
		static int n;
		static String firstname;
		static String lastname;
		static String name;
		static int salary;
		
		//setter method for ID
		
		public void setID(int i)
		{
			id=i;
		}
		//getter method for ID
		
		public int getID()
		{
			return id;
		}
		
		//setter method for FirstName
		
		public void setFirstName(String n)
		{
			firstname=n;
		}
		
		//getter method for FirstName
		
		public String getFirstName()
		{
			return firstname;
		}
		
		//setter method for LastName
		
		public void setLastName(String n1)
		{
			lastname=n1;
		}
		
		//getter method for LastName
		
		public String getLastName()
		{
			return lastname;
		}
		
		//setter method for salary
		
		public void setSalary(int s)
		{
			salary=s;
		}
		
		//getter method for salary
		
		public int getSalary()
		{
			return salary;
		}
		
		//Concatenating FirstName and LastName
		
		public String getName()
		{
			return firstname+" "+lastname;
		}
		
		//Method to calculate annual salary
		
		public int getAnnualSalary()
		{
			int annual_salary=salary*12;
			return annual_salary;
		}
		
		//Method to increase salary
		
		public int getRaiseSalary()
		{
			int sum=(salary*n)/100;  //salary increase by 40%
			int raise_salary=salary+sum;
			return raise_salary;
		}
		
		
		//to return string representation 
		
		public String toString()
		{
			return "Employee{" + "Employee ID : " + id + " "+ "Employee Name : " + firstname+" "+lastname + " "+ "Employee Salary : "+ salary +"}";
		}
		public static void main(String[] args) {
			
			EmployeeSalary emp=new EmployeeSalary();
			System.out.println("Enter the ID of the Employee : ");
			Scanner sc=new Scanner(System.in);
			id=sc.nextInt();
			System.out.println();
			
			System.out.println("Enter the First Name of the Employee : ");
			Scanner sc1=new Scanner(System.in);
			firstname=sc1.nextLine();
			System.out.println();
			
			System.out.println("Enter the Last Name of the Employee : ");
			Scanner sc2=new Scanner(System.in);
			lastname=sc2.nextLine();
			System.out.println();
			
			System.out.println("Enter the Salary of the Employee : ");
			Scanner sc3=new Scanner(System.in);
			salary=sc3.nextInt();
			System.out.println();
			
			System.out.println("Enter the percentage of salary raise for the employee");
			Scanner sc4=new Scanner(System.in);
			n=sc4.nextInt();
			
			System.out.println(emp.toString());
			System.out.println();
			System.out.print("Employee Annual Salary : ");
			System.out.println(emp.getAnnualSalary());
			System.out.print("Employee Salary raise by "+n+"% : ");
			System.out.println(emp.getRaiseSalary());
					

		}

	
}
