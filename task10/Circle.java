package task10;

import java.util.Scanner;

public class Circle {

	static int radius;
	static double circumference;
	
//Creating no argument constructor of class "Circle"
	
	Circle()
	{
		System.out.println("Calculating the Circumference of the circle");
	}
	
//Creating two arguments constructor of class "Circle"
	
	Circle(int r, double p)
	{
		radius=r;
		p=2.14;
	}
	
//Method to calculate circumference
	
	public double calculate_circumference()
	{
		circumference = 2* Math.PI * radius;
		return circumference;
	}
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle cir=new Circle();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		radius=sc.nextInt();
		System.out.println();
		System.out.print("The circumference of the Circle is : ");
		System.out.println(cir.calculate_circumference());
		

	}

}
