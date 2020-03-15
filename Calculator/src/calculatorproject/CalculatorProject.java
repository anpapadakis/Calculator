package calculatorproject;

import javax.swing.JFrame;

public class CalculatorProject {

	public static void main(String[] args) {
		Design design = new Design();

		design.setTitle("Calculator");
		design.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		design.setVisible(true);
		design.setResizable(false);
	}

}
