import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AppEleven {
    private JPanel panel1;
    private JTextField resultField;
    private JRadioButton onRadioButton;
    private JRadioButton offRadioButton;
    private JButton backspaceButton;
    private JButton divisionButton;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton multiplyButton;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton minusButton;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton addButton;
    private JButton equalButton;
    private JButton periodButton;
    private JButton a0Button;
    private JLabel titleLabel;
    private JButton ACButton;
 String operand;
 private double answer;
    public AppEleven() {


        backspaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = resultField.getText().length();
                int newLength = length - 1;
                String temp;
                if (length > 0) {
                    StringBuilder backSpace = new StringBuilder(resultField.getText());
                    backSpace.deleteCharAt(newLength);
                    temp = backSpace.toString();
                    resultField.setText(temp);
                }
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "7");
            }

        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "9");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "6");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "5");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "4");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "3");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "2");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "1");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultField.setText(resultField.getText() + "0");
            }
        });

        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand = "Division";
                resultField.setText(resultField.getText() + "/");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand = "Addition";
                resultField.setText(resultField.getText() + "+");
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand = "Subtraction";
                resultField.setText(resultField.getText() + "-");
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand = "Multiplication";
                resultField.setText(resultField.getText() + "*");
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmeticOperation();
            }
        });

        onRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                enable();
            }
        });
        offRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                disable();
            }
        });
    }




    private void enable() {
        onRadioButton.setEnabled(false);
        a0Button.setEnabled(true);
        a1Button.setEnabled(true);
        a2Button.setEnabled(true);
        a3Button.setEnabled(true);
        a4Button.setEnabled(true);
        a5Button.setEnabled(true);
        a6Button.setEnabled(true);
        a7Button.setEnabled(true);
        a8Button.setEnabled(true);
        a9Button.setEnabled(true);
        backspaceButton.setEnabled(true);
        ACButton.setEnabled(true);
        periodButton.setEnabled(true);
        multiplyButton.setEnabled(true);
        divisionButton.setEnabled(true);
        addButton.setEnabled(true);
        minusButton.setEnabled(true);
        offRadioButton.setEnabled(true);
        equalButton.setEnabled(true);
    }

    private void disable() {
        onRadioButton.setEnabled(true);
        a0Button.setEnabled(false);
        a1Button.setEnabled(false);
        a2Button.setEnabled(false);
        a3Button.setEnabled(false);
        a4Button.setEnabled(false);
        a5Button.setEnabled(false);
        a6Button.setEnabled(false);
        a7Button.setEnabled(false);
        a8Button.setEnabled(false);
        a9Button.setEnabled(false);
        backspaceButton.setEnabled(false);
        ACButton.setEnabled(false);
        periodButton.setEnabled(false);
        multiplyButton.setEnabled(false);
        divisionButton.setEnabled(false);
        addButton.setEnabled(false);
        minusButton.setEnabled(false);
        offRadioButton.setEnabled(false);
        equalButton.setEnabled(false);
    }


    private void  arithmeticOperation(){
            String [] parts;
            String leftPart , rightPart;
            switch (operand) {
                case "Addition":
                    parts = resultField.getText().split("\\+");
                    leftPart = parts[0];
                    rightPart = parts[1];
                    answer = Double.parseDouble(leftPart) + Double.parseDouble(rightPart);
                    resultField.setText(String.valueOf(answer));
                    break;
                case "Subtraction":
                    parts = resultField.getText().split("-");
                    leftPart = parts[0];
                    rightPart = parts[1];
                    answer = Double.parseDouble(leftPart) - Double.parseDouble(rightPart);
                    resultField.setText(String.valueOf(answer));
                    break;
                case "Multiplication":
                    parts = resultField.getText().split("\\*");
                    leftPart = parts[0];
                    rightPart = parts[1];
                    answer = Double.parseDouble(leftPart) * Double.parseDouble(rightPart);
                    resultField.setText(String.valueOf(answer));
                    break;
                case "Division":
                    parts = resultField.getText().split("/");
                    leftPart = parts[0];
                    rightPart = parts[1];
                    answer = Double.parseDouble(leftPart) / Double.parseDouble(rightPart);
                    resultField.setText(String.valueOf(answer));

                default:
                    resultField.setText("");
                    break;




            }
        }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AppEleven");
        frame.setContentPane(new AppEleven().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

