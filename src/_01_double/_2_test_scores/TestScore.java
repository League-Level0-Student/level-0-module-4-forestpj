package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {
	public static void main(String[] args) {
	String score = JOptionPane.showInputDialog(null, "What is your test score?");
	int Score = Double.parseDouble(score);
	if(Score <= 80) {
	JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
}
	
	if(Score >= 50 && Score <80){
	JOptionPane.showMessageDialog(null, "Wow! You must have not studied really hard for that test!");
	}
	
	if(Score <= 49) {
		JOptionPane.showMessageDialog(null, "Wow! You must not studied at all for that test!");
	}
}
}