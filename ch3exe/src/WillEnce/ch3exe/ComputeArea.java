package WillEnce.ch3exe;

import java.util.Scanner;

/*
 * Will Ence
 * 9/12/18
 * compute the are of a circle
 */

public class ComputeArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//step 1: enter the radius of a circle
		double PI = 3.14159265359793284626;
		
		
		double radius; 
		double area;
		
		//assign a value to radius
		System.out.println("enter the radius of a circle and press enter: ");
		radius = input.nextDouble(); 
		
		
		//step 2: compute the area using the following formula
		//area - radius*radius*pi
		
		area = radius*radius*PI;
		
		
		//step 3: display result
		
		System.out.println("the area of your circle is:" + area +"\"");

	}

}
