package Controller;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Controller.GlobalController.UIChange;

public class GeneratePasswordController {


    private final int DEFAULT_NO_OF_CHARACTERS = 10;
    private final int DEFAULT_SPECIAL_CHARACTERS = 5;
    private final int DEFAULT_NUMBERS = 5;
    private final int DEFAULT_UPPER_CASE = 0;
    private final int DEFAULT_LOWER_CASE = 0;

    private JSlider NoOfCharSliders;
    private JSlider spclCharactersSlider;
    private JButton resetButton;
    private JButton createButton;
    private JCheckBox upperCaseCheckBox;
    private JCheckBox lowerCaseCheckBox;
    private JSpinner spinnerUpper;
    private JSpinner spinnerLower;
    private JPanel generatePassword;
    private JSlider numbersSlider;
    private JLabel charactersLabel;
    private JLabel spclCharactersLabel;
    private JLabel numberLabel;

    GeneratePasswordController() {
        charactersLabel.setText(String.valueOf(DEFAULT_NO_OF_CHARACTERS));
        spclCharactersLabel.setText(String.valueOf(DEFAULT_SPECIAL_CHARACTERS));
        numberLabel.setText(String.valueOf(DEFAULT_NUMBERS));

        NoOfCharSliders.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                charactersLabel.setText(String.valueOf(NoOfCharSliders.getValue()));
            }
        });


        spclCharactersSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                spclCharactersLabel.setText(String.valueOf(spclCharactersSlider.getValue()));
            }
        });

        numbersSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                numberLabel.setText(String.valueOf(numbersSlider.getValue()));
            }
        });

        upperCaseCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (upperCaseCheckBox.isSelected()) {
                    spinnerUpper.setEnabled(true);
                } else {
                    spinnerUpper.setEnabled(false);
                }
                spinnerUpper.setValue(DEFAULT_UPPER_CASE);
            }
        });


        lowerCaseCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lowerCaseCheckBox.isSelected())
                {
                    spinnerLower.setEnabled(true);
                }
                else
                {
                    spinnerLower.setEnabled(false);
                }
                spinnerLower.setValue(DEFAULT_LOWER_CASE);
            }
        });


    }


    public static void main(String[] args) {
        UIChange();
        JFrame GeneratePasswordFrame = new JFrame("Generate Password");
        GeneratePasswordFrame.setContentPane(new GeneratePasswordController().generatePassword);
        GeneratePasswordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GeneratePasswordFrame.pack();
        GeneratePasswordFrame.setVisible(true);


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

