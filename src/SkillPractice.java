import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

	SkillPractice skills = new SkillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
}
void skill1() {
	// Use pop-ups for the following. DO NOT use Eclipse short cuts to help you
	// Ask the user how many dimes they have
	String Di = JOptionPane.showInputDialog("How many dimes do you have?");
	int Dimes = Integer.parseInt(Di);
	JOptionPane.showMessageDialog(null, "Congrats, you have " + Dimes*10 + " cents!" );
	
	// Tell them how many cents they have (hint multiply by 10)
	
	
	// Ask the user how tall they are (inches)
	String Inch = JOptionPane.showInputDialog("How tall are you, in inches?");
	int Height = Integer.parseInt(Inch);
	if(Height<36) {
		
		JOptionPane.showMessageDialog(null, "EAT YOUR WHEATIES!");
	}
	else {
		JOptionPane.showMessageDialog(null, "naisu");
		
	
	}
	
	// If they are shorter than 36 inches, tell them to eat their Wheaties
	
}

void skill2() {
	// Write a loop to print every third number between 1 and 30 to the console
	// Do NOT use Eclipse short-cuts to help you
	
	for(int i=1; i<31; i+=3) {
		System.out.println(i);	
	}
}

void skill3() {
	// Get a random number that is less than 20 and print it to the console
	Random Ran = new Random();
	int R=Ran.nextInt(21);
	int R2=Ran.nextInt(11);
	System.out.println(R);
    System.out.println(R2);
	
	
	
	
	// Get another random number that is less than 10 and print it to the console
	
	// Using a pop-up, tell the user the difference between the numbers
	// Hint: use subtraction
    System.out.println(R-R2);
	
}
void skill4() {
	// In a pop-up, ask the user for the city they live in
	String city = JOptionPane.showInputDialog("What city do you live in?");
	if(city.equals("San Diego")) {
		JOptionPane.showMessageDialog(null, "Good Choice. You live in America's finest city");
		}
	else {
		JOptionPane.showMessageDialog(null, "You've made some questionable life choices. it isn't too late to move to San Diego.");
	}
	
	// If they answered "San Diego", tell them they live in America's Finest City
	
	
	// Otherwise, tell them to move to San Diego

	// Create a variable - cars - and initialize it to the number of cars your family has.
	// If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
	int cars = 3;
	
	if(cars==0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transportation");
	}
	else if(cars==1) {
		JOptionPane.showMessageDialog(null, "The Model is 2017 Mazda CX9");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Your cars have a total of " + cars*4 + " Wheels.");
	}
		
	// If there is 1 car, use a pop-up to display the make/model of the car
	
	
	// If there is more than 1 car, use a pop-up to display how many wheels the
	// cars have between them.
	
}
void skill5() {
	// In a pop-up, ask the user for the name of their school
	String School = JOptionPane.showInputDialog("What is the name of your current school?");
	JOptionPane.showMessageDialog(null, "Huh. " + School + " sounds like a pertty good school");
	
	// In another pop-up, tell the user, that their school is a fantastic school. 
	// You must include the name of the school in the message.
	
}

}
