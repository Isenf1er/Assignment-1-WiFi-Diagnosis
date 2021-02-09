/* 
* Class: CMSC203 
* Instructor: Ahmed Tarek
* Description: A program that guides the user through various steps in order to restore their internet connectivity
* Due: 2/08/2021
* Platform/compiler: Eclipse
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Nicholas Prakoso
*/ 

import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		String x;
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println("First step: reboot your computer");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Are you able to connect with the internet? (yes or no)");
		x = userInput.nextLine();
		if(x.equals("yes"))
		System.out.println("Rebooting the computer seemed to work");
		else if(x.equals("no")) {
		System.out.println("Second step: reboot your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		}
		
		x = userInput.nextLine();
		if(x.equals("yes"))
		System.out.println("Rebooting the router seemed to work");
		else if(x.equals("no")) {
		System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		}
		
		x = userInput.nextLine();
		if(x.equals("yes"))
		System.out.println("Checking the router's cables seemed to work");
		else if(x.equals("no")) {
		System.out.println("Fourth step: move your computer closer to your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		}
		
		x = userInput.nextLine();
		if(x.equals("yes"))
		System.out.println("Moving your computer closer to the router seemed to work");
		else if(x.equals("no")) {
		System.out.println("Fifth step: contact your ISP");
		System.out.println("Make sure your ISP is hooked up to your router");
		}
		
		
		System.exit(0);
}
}