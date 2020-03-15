package calculatorproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Operations extends JDialog implements ActionListener {

	private JTextField txt = new JTextField();
	private JRadioButton degButton = new JRadioButton();
	private int cnt = 0, set = 0, misCounter = 0;
	private double a = 0, b = 0, c = 0;

	public Operations(JTextField txt, JRadioButton degButton) {
		this.txt = txt;
		this.degButton = degButton;
		txt.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton x = (JButton) e.getSource();

		switch (x.getText()) {
		case "+":
			set = 1;
			break;
		case "-":
			set = 2;
			break;
		case "*":
			set = 3;
			break;
		case "/":
			set = 4;
			break;
		}

		if (!(x.getText().equals("ce")) && !(x.getText().equals("c"))) {

			if (x.getText().equals("x^2")) {
				if (txt.getText().length() > 0) {
					b = Double.parseDouble(txt.getText());
					b = b * b;
					txt.setText("" + b);

				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}
			} else if (x.getText().equals("π")) {
				txt.setText("" + Math.PI);

			} else if (x.getText().equals("e")) {
				txt.setText("" + Math.E);

			} else if (x.getText().equals("+")) {

				if (txt.getText().length() > 0) {
					a = Double.parseDouble(txt.getText());
					txt.setText("");
				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}

			} else if (x.getText().equals("-")) {

				if (txt.getText().length() > 0) {
					a = Double.parseDouble(txt.getText());
					txt.setText("");
				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}

			} else if (x.getText().equals("*")) {

				if (txt.getText().length() > 0) {
					a = Double.parseDouble(txt.getText());
					txt.setText("");
				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}

			} else if (x.getText().equals("/")) {

				if (txt.getText().length() > 0) {
					a = Double.parseDouble(txt.getText());
					txt.setText("");
				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}

			} else if (x.getText().equals("√")) {

				if (txt.getText().length() > 0) {
					b = Double.parseDouble(txt.getText());
					b = Math.sqrt(b);
					txt.setText("" + b);

				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}

			} else if (x.getText().equals("%")) {

				if (txt.getText().length() > 0) {
					b = Double.parseDouble(txt.getText());
					b = b / 100;
					txt.setText("" + b);
				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}

			} else if (x.getText().equals("sin")) {
				if (txt.getText().length() > 0) {
					b = Double.parseDouble(txt.getText());
					b = Math.sin(b);

					if (degButton.isSelected() == true) {
						b = Math.toDegrees(b);
					}

					txt.setText("" + b);

				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}

			} else if (x.getText().equals("cos")) {

				if (txt.getText().length() > 0) {
					b = Double.parseDouble(txt.getText());
					b = Math.cos(b);

					if (degButton.isSelected() == true) {
						b = Math.toDegrees(b);
					}

					txt.setText("" + b);
				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}
			} else if (x.getText().equals("tan")) {

				if (txt.getText().length() > 0) {
					b = Double.parseDouble(txt.getText());
					b = Math.tan(b);

					if (degButton.isSelected() == true) {
						b = Math.toDegrees(b);
					}

					txt.setText("" + b);

				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}

			} else if (x.getText().equals("log")) {

				if (txt.getText().length() > 0) {
					b = Double.parseDouble(txt.getText());
					b = Math.log10(b);

					if (degButton.isSelected() == true) {
						b = Math.toDegrees(b);
					}

					txt.setText("" + b);

				} else {
					JOptionPane.showMessageDialog(this, "Click a number first!");
					misCounter += 1;
					System.out.println("misCounter is: " + misCounter);
				}

			} else if (x.getText().equals("+/-")) {

				if (cnt == 0 && txt.getText().length() == 0) {
					txt.setText("-");
					cnt = 1;
					return;
				}

				if (cnt == 1) {
					txt.setText("");
					cnt = 0;
				}

			} else if (x.getText().equals("=")) {
				if (txt.getText().length() > 0) {

					c = Double.parseDouble(txt.getText());

					if (set == 1) {
						txt.setText("" + (a + c));

					} else if (set == 2) {
						txt.setText("" + (a - c));

					} else if (set == 3) {
						txt.setText("" + (a * c));

					} else if (set == 4) {
						txt.setText("" + (a / c));
					}
				}

			} else {
				txt.setText(txt.getText() + x.getText());
			}

		}

	}

}
