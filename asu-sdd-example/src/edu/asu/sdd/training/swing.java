package edu.asu.sdd.training;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing extends JFrame implements ActionListener {
    JFrame frame;
    JTextField textField1, textField2;
    JButton button, addButton, subButton, mulButton, divButton;
    JButton[] functionButtons = new JButton[4];
    JLabel label1, label2;
    JPanel panel;

    swing() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label1 = new JLabel();
        label1.setText("enter your first number: ");
        label1.setBounds(50, 0, 150, 50);

        textField1 = new JTextField();
        textField1.setBounds(50, 50, 300, 50);

        label2 = new JLabel();
        label2.setText("enter your second number: ");
        label2.setBounds(50, 100, 200, 50);

        textField2 = new JTextField();
        textField2.setBounds(50, 150, 300, 50);

        button = new JButton("Exit");
        button.addActionListener(this);
        button.setBounds(160, 300, 80, 50);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;

        for (int i = 0; i < 4; i++) {
            functionButtons[i].addActionListener(this);
        }

        panel = new JPanel();
        panel.setBounds(50, 230, 300, 50);
        panel.setLayout(new GridLayout(1, 4));
        panel.add(functionButtons[0]);
        panel.add(functionButtons[1]);
        panel.add(functionButtons[2]);
        panel.add(functionButtons[3]);

        frame.add(label1);
        frame.add(label2);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(panel);
        frame.setVisible(true);
        frame.add(button);
    }

    public static void main(String[] args) {
        swing frame = new swing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.exit(0);
        }

        for (int i = 0; i < 4; i++) {
            String number1 = textField1.getText();
            String number2 = textField2.getText();
            if (e.getSource() == functionButtons[i]) {
                switch (i) {
                    case 0:
//                        System.out.println(Integer.parseInt(number1) + Integer.parseInt(number2));
                        JOptionPane.showMessageDialog(frame, (Integer.parseInt(number1)) + " + " + (Integer.parseInt(number2)) + " = " + (Integer.parseInt(number1) + Integer.parseInt(number2)) + " ");
                        break;
                    case 1:
//                        System.out.println(Integer.parseInt(number1) - Integer.parseInt(number2));
                        JOptionPane.showMessageDialog(frame, (Integer.parseInt(number1)) + " - " + (Integer.parseInt(number2)) + " = " + (Integer.parseInt(number1) - Integer.parseInt(number2)) + " ");
                        break;
                    case 2:
//                        System.out.println(Integer.parseInt(number1) * Integer.parseInt(number2));
                        JOptionPane.showMessageDialog(frame, (Integer.parseInt(number1)) + " * " + (Integer.parseInt(number2)) + " = " + (Integer.parseInt(number1) * Integer.parseInt(number2)) + " ");
                        break;
                    case 3:
//                        System.out.println(Integer.parseInt(number1) / Integer.parseInt(number2));
                        JOptionPane.showMessageDialog(frame, (Integer.parseInt(number1)) + " / " + (Integer.parseInt(number2)) + " = " + (Integer.parseInt(number1) / Integer.parseInt(number2)) + " ");
                        break;
                }
            }
        }
    }
}
