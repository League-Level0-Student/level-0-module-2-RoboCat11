//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	Random ran = new Random();
	int randomChoice = ran.nextInt(3) + 1;
	// 1. Make a main method that includes all the steps below
		public static void main(String[]args) {

		// 2. Get the user to enter a question for the 8 ball to answer
			String input = JOptionPane.showInputDialog("What is your question?");
	

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
			Random gen = new Random();
			int number = gen.nextInt(4);
			if(number == 0 ) {
			JOptionPane.showMessageDialog(null,"Yes");
				
			}
			

	
	// 4. If the random number is 0

	// -- tell the user "Yes"
if(number == 0 ) {
JOptionPane.showMessageDialog(null,"Yes");	
}
	// 5. If the random number is 1

	// -- tell the user "No"
if(number == 0 ) {
JOptionPane.showMessageDialog(null,"No");
}
	// 6. If the random number is 2
if(number == 0 ) {
JOptionPane.showMessageDialog(null,"");
	// -- tell the user "Maybe you should ask Google?"
if(number == 0 ) {
JOptionPane.showMessageDialog(null,"Maybe you should ask Google?");
}
	// 7. If the random number is 3

	// -- write your own answer
if(number == 0 ) {
JOptionPane.showMessageDialog(null,"I don't know!!!");
}
		}
}
