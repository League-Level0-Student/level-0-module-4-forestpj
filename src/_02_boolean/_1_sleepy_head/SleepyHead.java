package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false
		//int number = 0;
		//double number2 =2;
		//String words = "word";
		//char c = 'A';
		//boolean isTrue = false;
		//isTrue = true;
		//if(isTrue == true) {
			
		//}

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog(null, "what day is it?");
		// Set the boolean isWeekend based on the value they enter
	    if(day.equals ("Saturday")) {
	    	isWeekend = true;
	    }
	    else if(day.equals("Sunday")) {
			isWeekend = true;
		}
		else {
			isWeekend = false;
		}
		
		// If it is the weekend, tell the user they get to sleep in.
	if (isWeekend){
		JOptionPane.showMessageDialog(null, "you can sleep in");
	}
		// If it is not the weekend, tell them to get out of bed and go to school!
	if (!isWeekend) {
		JOptionPane.showMessageDialog(null, "get out of bed and go to school!");
	}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String score = JOptionPane.showInputDialog(null, "What was your score for your last exam?");
		double doublepassedExam = Double.parseDouble(score);
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if(doublepassedExam>=70) {
			passedExam = true;
		}
		else {
			passedExam = false;
		}
		// If the user passed the exam, congratulate them
		if (passedExam){
			JOptionPane.showMessageDialog(null, "you pass");
		}

		// otherwise, wish them better luck next time.
		if (!passedExam){
			JOptionPane.showMessageDialog(null, "you don't pass");
		}
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true
if(gameOver.equals("yes")) {
	gameIsOver = true;
}
		}
		// Tell the user "game is over" 
		if (gameIsOver){
			JOptionPane.showMessageDialog(null, "game is over");
		}
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed=false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String red = JOptionPane.showInputDialog("what color do you want to draw with");
		if (red.equals("red")){
			isRed = true;
		}
		boolean isSquare=false;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String square = JOptionPane.showInputDialog("what shape do you want to draw");
		if (square.equals("square")){
			isSquare = true;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if (isRed==true && isSquare==true) {
			
		}

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.penDown();
		// Complete the rest of this method
	}	
}
