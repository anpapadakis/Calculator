package calculatorproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Design extends JFrame {

    private static final int rowSize = 5;
    private static final int colSize = 6;
    public JTextField textView;
    public JRadioButton degButton;
    public JRadioButton radButton;
    public JButton button;     //button for numbers and operations
    private JPanel viewPanel;   //panel for textfield
    private JPanel buttonPanel; //panel for buttons

    public Design() {
        setLayout(new BorderLayout());

        // initialization of the fields
        
        viewPanel = new JPanel(new GridLayout());
        buttonPanel = new JPanel();

        degButton = new JRadioButton("Deg");
        radButton = new JRadioButton("Rad");

        textView = new JTextField();
        textView.setHorizontalAlignment(JTextField.TRAILING);
        viewPanel.add(textView);

        buttonPanel.setLayout(new GridLayout(rowSize, colSize, 3, 3));
        Operations opListener = new Operations(textView , degButton);

        //creation of the appearence
        
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                
                if (i == 0 && j == 0) {
                    radButton.setSelected(true);
                    degButton.setSelected(false);
                    buttonPanel.add(degButton);
                    degButton.setToolTipText("Click for degrees");
                    degButton.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            degButton.setSelected(true);
                            radButton.setSelected(false);
                        }
                    });
                } 
                else if (i == 0 && j == 1) {
                    buttonPanel.add(radButton);            
                    radButton.setToolTipText("Click for radius");
                    radButton.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            radButton.setSelected(true);
                            degButton.setSelected(false);
                        }
                    });
                } 
                else {
                    button = new JButton();

                    if (i == 0 && j == 2) {
                        button.setText("%");
                        button.setToolTipText("Click to calculate percentage");
                    } 
                    else if (i == 0 && j == 3) {
                        button.setText("ce");
                        button.setToolTipText("Click to clear text view");
                        button.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                textView.setText("");
                            }
                        });
                    } 
                    else if (i == 0 && j == 4) {
                        button.setText("c");
                        button.setToolTipText("Click to delete the last number");
                        button.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                if (textView.getText().equals("")) {
                                    return;
                                }
                                textView.setText(textView.getText().substring(0, textView.getText().length() - 1));
                            }
                        });
                    } else if (i == 0 && j == 5) {
                        button.setText("+/-");
                        button.setToolTipText("Click for negative number");
                    } else if (i == 1 && j == 0) {
                        button.setText("sin");
                        button.setToolTipText("Click to calculate sinus");
                    } else if (i == 1 && j == 1) {
                        button.setText("cos");
                        button.setToolTipText("Click to calculate cosinus");
                    } else if (i == 1 && j == 2) {
                        button.setText("7");
                        button.setToolTipText("Click to add number");
                    } else if (i == 1 && j == 3) {
                        button.setText("8");
                        button.setToolTipText("Click to add number");
                    } else if (i == 1 && j == 4) {
                        button.setText("9");
                        button.setToolTipText("Click to add number");
                    } else if (i == 1 && j == 5) {
                        button.setText("/");
                        button.setToolTipText("Click for division");
                    } else if (i == 2 && j == 0) {
                        button.setText("tan");
                        button.setToolTipText("Click to calculate tangent");
                    } else if (i == 2 && j == 1) {
                        button.setText("√");
                        button.setToolTipText("Click to calculate square root");
                    } else if (i == 2 && j == 2) {
                        button.setText("4");
                        button.setToolTipText("Click to add number");
                    } else if (i == 2 && j == 3) {
                        button.setText("5");
                        button.setToolTipText("Click to add number");
                    } else if (i == 2 && j == 4) {
                        button.setText("6");
                        button.setToolTipText("Click to add number");
                    } else if (i == 2 && j == 5) {
                        button.setText("*");
                        button.setToolTipText("Click for multiplication");
                    } else if (i == 3 && j == 0) {
                        button.setText("log");
                        button.setToolTipText("Click to calculate log base 10");
                    } else if (i == 3 && j == 1) {
                        button.setText("x^2");
                        button.setToolTipText("Click to calculate x^2");
                    } else if (i == 3 && j == 2) {
                        button.setText("1");
                        button.setToolTipText("Click to add number");
                    } else if (i == 3 && j == 3) {
                        button.setText("2");
                        button.setToolTipText("Click to add number");
                    } else if (i == 3 && j == 4) {
                        button.setText("3");
                        button.setToolTipText("Click to add number");
                    } else if (i == 3 && j == 5) {
                        button.setText("-");
                        button.setToolTipText("Click for subtraction");
                    } else if (i == 4 && j == 0) {
                        button.setText("π");
                        button.setToolTipText("Click to add number");
                    } else if (i == 4 && j == 1) {
                        button.setText("e");
                        button.setToolTipText("Click to add number");
                    } else if (i == 4 && j == 2) {
                        button.setText(".");
                        button.setToolTipText("Click for decimal number");
                    } else if (i == 4 && j == 3) {
                        button.setText("0");
                        button.setToolTipText("Click to add number");
                    } else if (i == 4 && j == 4) {
                        button.setText("=");                   
                    } else if (i == 4 && j == 5) {
                        button.setText("+");
                        button.setToolTipText("Click for addition");
                    }

                    buttonPanel.add(button);
                    button.setFocusable(false);
                    button.addActionListener(opListener);
                }
            }

        }
        add(viewPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        pack();
    }
}
