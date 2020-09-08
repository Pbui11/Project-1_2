/*
 * Class: CMSC201 
 * Instructor:Ashique Tanveer
 * Description: Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 * Due: 09/09/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Name: Phuc Bui.
*/

import java.util.Scanner; //Import the scanner class

public class CostOfDriving {

	public static void main(String[] args) {
		//Create a new object of type Scanner that reads from the keyboard
				Scanner input = new Scanner(System.in);
				//Initialize variables
				double d; //Driving distance
				double m; //Miles per gallon
				double p; //Price per gallon
				double c; //The cost of driving
				
				//Prompt the user to enter the driving distance
				
				System.out.print("Enter the driving distance: ");
				d = input.nextDouble();
					
				while (d<0){
					System.out.println("\nPlease re-enter a positive driving distance: ");
					d = input.nextDouble();
					}
				//Prompt the user to enter miles per gallon
				System.out.print("\nEnter miles per gallon: ");
				m = input.nextDouble();
				
				while (m<0) {
					System.out.println("\nPlease re-enter a positive value of miles per gallon: ");
					m = input.nextDouble();
					}
				
				//Prompt the user to enter price per gallon
				System.out.print("\nEnter price per gallon: ");
				p = input.nextDouble();
				
				while (p<0) {
					System.out.println("\nPlease re-enter a positive value of price per gallon: ");
					p = input.nextDouble();
					}
				
				
				//Formula the cost of driving
				c = d*p/m;
				
					
				//Display the cost of driving
				System.out.printf("\nThe cost of driving is $ %.2f",c);
			
				input.close();
			
		}
	}

