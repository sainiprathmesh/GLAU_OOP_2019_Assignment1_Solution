/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;


public class Gravity {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			double time = s.nextDouble();
			double speed = 9.8*time;
			double distance = 0.5*9.8*time*time;
			String str = String.format("%.15f",speed);
		System.out.println("The speed of the object at "+time+" seconds after its release is "+str+" and the distance the object has travelled in the "+time+" seconds after the relase is "+distance);
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
