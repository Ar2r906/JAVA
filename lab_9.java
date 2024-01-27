/*
 * калькулятор
 */

package lab_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab_9 extends JFrame implements ActionListener {

    private JTextField textField;
    private double firstNumber, secondNumber, result;
    private String operation;

    public lab_9() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textField = new JTextField(10);
        textField.setEditable(false);

        textField = new JTextField(10);
        textField.setPreferredSize(new Dimension(200, 50)); // размер поля ввода
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 24)); // размер шрифта

        panel.add(textField, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            button.setBackground(Color.BLUE); // цвет фона кнопок
            button.setForeground(Color.WHITE); // цвет текста кнопок
            buttonsPanel.add(button);
        }
        
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(this);
        clearButton.setBackground(Color.BLUE);
        clearButton.setForeground(Color.WHITE);
        clearButton.setPreferredSize(new Dimension(300, 50));
        panel.add(clearButton, BorderLayout.SOUTH);

        panel.add(buttonsPanel, BorderLayout.CENTER);
        add(panel);
        setSize(300, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("C")) {
            textField.setText("");
        } else if (command.equals("=")) {
            secondNumber = Double.parseDouble(textField.getText());
            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ошибка: деление на ноль!");
                        textField.setText("");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
        } else {
            if (!textField.getText().isEmpty()) {
                firstNumber = Double.parseDouble(textField.getText());
                operation = command;
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            lab_9 calculator = new lab_9();
            calculator.setVisible(true);
        });
    }
}

