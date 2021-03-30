package Controller;

import javax.swing.*;

import static Controller.GlobalController.UIChange;

public class GeneratePasswordController {
    private JSlider slider1;
    private JSlider slider2;
    private JSlider slider3;
    private JButton button1;
    private JButton button2;
    private JCheckBox bothCheckBox;
    private JCheckBox upperCaseCheckBox;
    private JCheckBox lowerCaseCheckBox;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JPanel Contents;


    public static void main(String[] args) {
        UIChange();
        JFrame mainFrame = new JFrame("Generate Password");
        mainFrame.setContentPane((new GeneratePasswordController().Contents));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);


    }

}

